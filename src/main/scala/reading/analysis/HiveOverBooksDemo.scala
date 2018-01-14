package reading.analysis

import java.io.File

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object HiveOverBooksDemo {

  /**
    * Info:
    * Convert csv to textFile sed 's/\&amp;/\&/g' BX-Books.csv | sed -e '1d' |sed 's/;/$$$/g' | sed 's/"$$$"/";"/g' | sed 's/"//g' > BX-BooksCorrected.txt
    */

  def main(args: Array[String]): Unit = {

    val warehouselocation = new File("spark-warehouse")

    val conf = new SparkConf().set("spark.sql.warehouse.dir",warehouselocation.getAbsolutePath).setAppName("Book Analysis Demo").setMaster("local[*]")
    val spark = SparkSession.builder().config(conf).enableHiveSupport().getOrCreate()


    import spark.sql

    if (warehouselocation.listFiles().find(dir => dir.getName.equals("book")).isEmpty){
      sql("create table if not exists book (Isbn STRING, Title STRING, Author STRING,YearOfPublication STRING, Publisher STRING, ImgUrl STRING) ROW FORMAT DELIMITED  FIELDS TERMINATED BY ',' stored as TEXTFILE")
      sql("load data local INPATH 'resources/BX-BooksCorrected.txt' into table book ")
    }

    sql("select * from book").show()
    sql("select count(Isbn) from book").show()
    sql("select Author,Title,YearOfPublication,count(Title)  from book group by Author,Title,YearOfPublication").show()
  }

}
