package example

import org.apache.spark.SparkConf
import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

object SpecifyingSchemaDemo {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Schema Demo").setMaster("local[*]");
    val spark = SparkSession.builder().config(conf).getOrCreate();
    val userRDD = spark.sparkContext.textFile("resources/userText.txt")

    val schemaString = "name id"

    val fields = schemaString.split(" ")
      .map(fieldName => StructField(fieldName,StringType,false))

    val schema = StructType(fields);

    val rowRDD = userRDD.map(_.split(",")).map(attribute => Row(attribute(0),attribute(1)))

    val userDf = spark.createDataFrame(rowRDD,schema)

    userDf.show()

    userDf.createOrReplaceTempView("user")

    val result =   spark.sql("select * from user where id<6")

    import spark.implicits._

    result.map(attribute => "Name: "+attribute(0)).show()

  }

}
