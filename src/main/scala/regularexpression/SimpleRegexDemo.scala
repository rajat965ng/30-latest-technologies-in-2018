package regularexpression

object SimpleRegexDemo {

  def main(args: Array[String]): Unit = {
    val pattern = "(S|s)cala".r
    val str = "Scala is my favorite language. Hello scala!"

    println(pattern findFirstIn str)
    println((pattern findAllIn  str).mkString(","))
    println(pattern replaceAllIn(str,"Java"))
  }

}
