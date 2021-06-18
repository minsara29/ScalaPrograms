import scala.util.control.Breaks

object IfAndLoopsDemo {
  def main(args: Array[String]): Unit = {

    val str: String = "Kannan"

    if (str == "kannan") {
      println("the string is matching with kannan")
    } else if (str == "dahlia") {
      println("this is match with dahlia")
    } else {
      println("something is not matching ")
    }

    for (i <- 1 to 10 ) println("value of i = "+ i)

    for (i <- 1 to 3 ; j <- 0 until 2) println("value of i, j ("+i+","+j+")")

    val list = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i <- list if i %2 == 0 ) println(i)

    //break

    var breakObj = new Breaks()
    breakObj.breakable(
      for (i <- list if i % 2 == 0) {
        println(i)
        if (i == 4) {
          println("I am breaking the loop")
          breakObj.break()
        }
      }
    )


  }
}
