package streaming.structured

import org.apache.spark.SparkConf

object BasicOperationsDemo {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("Operations Demo")

  }

}
