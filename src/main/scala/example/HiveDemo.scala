package example

import java.io.File

import org.apache.spark.SparkConf
import org.apache.spark.sql.{Row, SparkSession}

object HiveDemo {

  case class Record(key:Int,value:String)

  def main(args: Array[String]): Unit = {

    val warehouselocation = new File("spark-warehouse")
    val conf = new SparkConf().set("spark.sql.warehouse.dir",warehouselocation.getAbsolutePath)
                    .setAppName("Hive Demo").setMaster("local[*]")
    val spark = SparkSession.builder().config(conf).enableHiveSupport().getOrCreate()
    import  spark.sql

    if(!warehouselocation.exists()) {
      sql("create table if not exists src (key INT, value STRING) using hive")
      sql("load data local INPATH 'resources/kv1.txt' into table src")
    }

    sql("select * from src").show()

    val sqlDf = sql("select * from src")
    import spark.implicits._
    val stringDs = sqlDf.map{case Row(key:Int,value:String) => s"key: $key, value: $value"}
    stringDs.show()

    val recordsDf = spark.createDataFrame((1 to 10).map(i => Record(i,s"val_$i")))
    recordsDf.show()

  }

}
