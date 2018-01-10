package example

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


object CreatingDataSetDemo {

  case class User(first_name:String, id:Long,last_name:String,avatar:String)


  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("create Demo").setMaster("local[*]")
    val spark = SparkSession.builder().config(conf).getOrCreate()
    import spark.implicits._

    val user = User("Andy",4,"Murray","http://andymurray.com");
    val caseClassDs = Seq(User("Andy",4,"Murray","http://andymurray.com")).toDS()
    caseClassDs.show()

    val userdf = spark.read.json("resources/user.json").as[User]
    userdf.show()

  }

}
