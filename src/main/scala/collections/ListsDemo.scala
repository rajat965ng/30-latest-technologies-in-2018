package collections

import scala.collection.mutable.ListBuffer

object ListsDemo {

  def main(args: Array[String]): Unit = {

    var myVar = List("abc","def","xyz",10,20)
    for(v<-myVar){
      println(v)
    }

    var myVar2:List[Int] = List(20,10,30);
    for(v<-myVar2){
      println(v)
    }

    var emptyList = ListBuffer[Int]();
    emptyList+=10
    println(emptyList)

    var dim:List[List[Int]] = List(
      List(1,0,0),
      List(0,1,0),
      List(0,0,1)
    )
    println(dim)

    val fruits = "apples"::("oranges"::("pears"::Nil))
    println(fruits)

    val nilList = Nil
    println(nilList)

    println(fruits.head)
    println(fruits.tail)
    println(nilList.isEmpty)

    var list2 = myVar2:::fruits
    println(list2)
    list2 = myVar2.:::(fruits)
    println(list2)

    var fillList = List.fill(2)("Hello")
    println(fillList)

    var squares = List.tabulate(6)(n=>n*n)
    println(squares)

    var mul = List.tabulate(5,4)(_*_)
    println(mul)

    println(squares.reverse)

  }

}
