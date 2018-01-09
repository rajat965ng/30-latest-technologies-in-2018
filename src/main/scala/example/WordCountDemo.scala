package example

import org.apache.spark.{SparkConf, SparkContext}

object WordCountDemo {

  def main(args: Array[String]): Unit = {
    val path = "/home/rajat/workspace/spark-app/resources/article.txt";
    val conf = new SparkConf().setAppName("Word Count App").setMaster("local[*]")
    val sc = new SparkContext(conf);
    val file = sc.textFile(path)
    val count = file.flatMap(line => line.split(" "))
      .map(word => (word,1)).reduceByKey(_+_);
    println("RDD Count:"+count.count())
    count.foreach(println)
  }

}
