package functions

import java.util.Date

object PartialFunctionDemo {

  def main(args: Array[String]): Unit = {
    var date = new Date();
    var logString =  log(date,_:String)
    logString("Hello World 1")
    Thread.sleep(1000)
    logString("Hello World 2")
    Thread.sleep(1000)
    logString("Hello World 3")
    Thread.sleep(1000)
  }

  def log(date: Date,message: String): Unit ={
    println(date+" --------> "+message);
  }

}
