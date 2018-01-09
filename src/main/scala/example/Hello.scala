package example

import org.apache.spark.{SparkConf, SparkContext}

object Hello {

  def main(args: Array[String]): Unit = {

    val article = "/home/rajat/workspace/spark-app/resources/article.txt"
    val conf = new SparkConf().setAppName("Spark App").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val file = sc.textFile(article);
    val numAs = file.filter(line => line.contains("a")).count()
    println("Lines contains A's:"+numAs)

  }

}
