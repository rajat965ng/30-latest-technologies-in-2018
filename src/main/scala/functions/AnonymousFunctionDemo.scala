package functions

object AnonymousFunctionDemo {

  def main(args: Array[String]): Unit = {
    var inc = (x:Int) => x+1
    println(inc(7))
    var x = inc(7)-1
    println(x)
    var mul = (x:Int,y:Int) => x*y
    println(mul(8,7))
    var userDir = () => {System.getProperty("user.dir")}
    println(userDir())

  }

}
