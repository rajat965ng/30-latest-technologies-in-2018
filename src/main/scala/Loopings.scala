import scala.util.control.Breaks

object Loopings {

  def main(args: Array[String]): Unit = {

    var x = 0;

    println("To Loop !!")
    for(x <- 9 to 20){
      println(x)
    }

    println("Until Loop !!")
    for(x <- 9 until 20){
      println(x)
    }

    val numList = List(1,2,5,6,8,7);
    println("Display List !!")
    for(num <- numList){
      println(num)
    }

    val nameList = List("abc","xyz","srk")
    println("Display Names !!")
    for(name <- nameList){
      println(name)
    }

    println("loop with condition")
    for (name<-nameList if name.equals("srk")){
        println(name)
    }


    println("yield data in a variable")
    val result =  for {name<-nameList if !name.equals("srk")
      }yield name

    println(result)

    println("Breaking loops")
    var loop = new Breaks;
    loop.breakable{
      for(name<-nameList){
        println(name)
        if (name.equals("xyz")){
          println("Breaking at :"+name)
          loop.break();
        }
      }
    }


  }

}
