package functions

object ArgsFunctionDemo {

  def main(args: Array[String]): Unit = {
    printString("Hello","Scala","Python")
  }

  def printString(t: String*): Unit ={
    var i:Int = 0;

    for(arg <- t){
      println("The element on index: "+i+" is "+arg)
      i+=1;
    }

  }

}
