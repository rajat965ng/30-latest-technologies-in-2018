package streaming.structured

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.StructType

object StreamingDataframeDemo {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Stream Dataframe").setMaster("local[*]")
    val spark = SparkSession.builder().config(conf).getOrCreate()

    val socketDf  =  spark.readStream.format("socket").option("host","localhost").option("port",9999).load()

    println("Socker Streaming:" +socketDf.isStreaming)
    socketDf.printSchema()

    val schema = new StructType().add("Isbn","string").add("Title","string").add("Author","string")

    val csvDf = spark.readStream.option("sep",";").schema(schema).csv("resources/data")


    val query = csvDf.writeStream.outputMode("update").format("console")
      .option("path","resources/parquet/book").option("checkpointLocation","resources/parquet/checkpoint")
      .start()

    query.awaitTermination(5000)

  }

}
