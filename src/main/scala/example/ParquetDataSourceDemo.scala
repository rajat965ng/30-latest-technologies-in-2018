package example

import org.apache.spark.SparkConf
import org.apache.spark.sql.{SaveMode, SparkSession}

object ParquetDataSourceDemo {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Parquet Demo").setMaster("local[*]")
    val spark = SparkSession.builder().config(conf).getOrCreate()
    val userDf = spark.read.json("resources/user.json")
    userDf.write.mode(SaveMode.Overwrite).partitionBy("id").format("parquet").parquet("resources/user.parquet")

    val parquetDF = spark.read.parquet("resources/user.parquet")
    parquetDF.createOrReplaceTempView("userParquet")

    val result = spark.sql("select * from userParquet where id between 1 and 3")
    import spark.implicits._

    result.map(result => "Name: "+result.getAs[String]("first_name")).show()


  }

}
