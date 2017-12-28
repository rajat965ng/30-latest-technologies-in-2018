package collections

object IteratorDemo {

  def main(args: Array[String]): Unit = {

    var ita = Iterator("a","number","of","words")
    var itb = Iterator("are","you","ready","yup")



    while(ita.hasNext){
      println(ita.next())
    }

    val itc = Iterator(20,40,2,50,69, 90)
    val itd = Iterator(120,140,12,150,169, 190)
    println(itc.max)


    println(itd.length)

  }

}
