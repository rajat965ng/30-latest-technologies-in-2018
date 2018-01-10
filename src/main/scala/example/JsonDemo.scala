package example

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object JsonDemo {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("JSON Demo").setMaster("local[*]");
    val sql = SparkSession.builder().appName("JSON Demo").config(conf).getOrCreate();
    val df = sql.read.json("resources/user.json");
    import sql.implicits._
    df.show();
    df.printSchema();
    df.select("first_name").show()
    df.select($"first_name",$"id"+1).show()
    df.filter($"id">1).show()
    df.groupBy("first_name").count().show()

    df.createOrReplaceTempView("user")

    val sqlDf = sql.sql("select * from user")
    sqlDf.show()

  }

}
