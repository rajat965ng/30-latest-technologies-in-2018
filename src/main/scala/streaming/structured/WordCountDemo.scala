package streaming.structured

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object WordCountDemo {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("Structured Word Count")
    val spark = SparkSession.builder().config(conf).getOrCreate()

    import spark.implicits._

    val lines = spark.readStream.format("socket")
      .option("host","localhost")
      .option("port","9999")
      .load()

    val words = lines.as[String].flatMap(_.split(" "))

    val wordCount = words.groupBy("value").count()

    val query = wordCount.writeStream
      .outputMode("complete")
      .format("console")
      .start()

    query.awaitTermination()

  }

}
