package arrays

import Array._


object ArrayDemo {

  def main(args: Array[String]): Unit = {
    var arr = new Array[String](3)
    arr(0) = "Google"; arr(1) = "Microsoft"; arr(2) = "Facebook"
    arr.toStream.foreach(println)
    var moreArr = Array("JP Morgan", "Fidelity", "Barclays",9,10.89)
    moreArr.foreach(println)
    for (x <- moreArr){
      println(x)
    }

    println("<---------------------->")
    for(i<-0 to arr.length-1){
      println(arr(i))
    }

    var matrix = Array.ofDim[Int](2,2);

    for (i <- 0 until  2){
      for (j <- 0 until  2){
        matrix(i)(j) = (i+j)
        print(matrix(i)(j)+" ")
      }
      println()
    }

    var list1 = Array(1,2,4);
    var list2 = Array(3,5,6);

    list1 = concat(list1,list2).sorted

    list1.toStream.foreach(print)

    var range1 = range(10,20,2)
    var range2 = range(11,19,2)

    range1 = concat(range1,range2).sorted
    range1.toStream.foreach(e=>print(e+"\t"));

  }

}
