package patternMatching

object CaseClassDemo {

  def main(args: Array[String]): Unit = {

    var alice = new Person("Alice", 21)
    var bob = new Person("Bob", 25)
    var charlie = new Person("Charlie", 30)

    for (person <- List(alice, bob, charlie)) {

      person match {
        case Person("Alice", 21) => println("Hi, Alice !")
        case Person("Bob", 25) => println("Hi, Bob !")
        case Person(name: String, age: Int) => println("Hi, " + name + " !. \n the age is :" + age + ".")
      }

    }
  }
  case class Person(name:String,age:Int)
}
