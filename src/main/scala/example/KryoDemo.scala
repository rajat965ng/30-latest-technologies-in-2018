package example

import example.CreatingDataSetDemo.User
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object KryoDemo {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("kryo Demo")
    val spark = SparkSession.builder().config(conf).getOrCreate()
    import spark.implicits._

    val userDf = spark.sparkContext.textFile("resources/userText.txt")
      .map(_.split(","))
      .map(user => User(user(0),user(1).toInt,user(2),user(3)))
      .toDF()

    userDf.show()

    userDf.createOrReplaceTempView("people")

    val seqUser = userDf.sqlContext.sql("select * from people where id between 6 and 7")
    seqUser.map(u => "Name: "+u(0)).show()
    seqUser.map(u => "avatar: "+u.getAs[String]("avatar")+"").show()

    implicit val mapEncoder = org.apache.spark.sql.Encoders.kryo[Map[String,Any]]

    seqUser.map(u => u.getValuesMap[Any](List("first_name","id")) ).collect().foreach(println)

  }

}
