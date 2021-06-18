//package main.scala

object MatchDemo {

  def main(args: Array[String]): Unit = {

    var age: Int = 10

    age match {
      case 40 => println("age is 40")
      case 50 => println("age is 50")
      case i if (i > 1 && i < 12) => println("kids")
      case i if (i > 13 && i < 19) => println("teen")
      case _ => println("none")
    }

  }


}
