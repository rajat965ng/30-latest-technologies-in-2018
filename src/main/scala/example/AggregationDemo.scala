package example

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object AggregationDemo {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Aggregate Demo").setMaster("local[*]")
    val spark = SparkSession.builder().config(conf).getOrCreate()
    val userDF = spark.read.json("resources/user.json")
    userDF.show()

    userDF.createOrReplaceTempView("user")

    val result = spark.sql("select sum(id) as sum_id,count(*) as user_count, avg(id) as avgId from user")

    result.show()

  }

}
