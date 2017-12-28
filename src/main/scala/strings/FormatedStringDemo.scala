package strings

object FormatedStringDemo {

  def main(args: Array[String]): Unit = {
    var str = "Hello"
    var intVar = 10
    var floatVar = 12.456

    var fs = printf("Quick brown %s, jumps from %d ft and run %f kms",str,intVar,floatVar);

    println(fs)

  }

}
