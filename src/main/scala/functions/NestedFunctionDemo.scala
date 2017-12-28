package functions

object NestedFunctionDemo {

  def main(args: Array[String]): Unit = {
    println(factorial(2))
  }

  def factorial(a:Int):Int = {
    def fact(i:Int): Int ={
      if(i==0){
        return 1
      }
      return i*fact(i-1)
    }
    return fact(a);
  }

}
