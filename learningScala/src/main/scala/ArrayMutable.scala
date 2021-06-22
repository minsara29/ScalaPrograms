import scala.collection.mutable.ArrayBuffer


object ArrayMutable {

  def main(args: Array[String]): Unit = {

    var marks = ArrayBuffer[Int]()

//    marks(0) = 10 these are not working
//    marks(1) = 20
//    marks(2) = 30
//    marks(3) = 40

    marks += 50
    marks += 40
    marks += 30
    marks += 20
    marks += 10

    marks.append(60)
    marks ++= Array(101, 202, 303)

    marks.foreach(println)

    marks -= 101 // remove first element from Arrays
    println("After removing the elements")
    marks.foreach(println)




  }

}
