object DoWhileForLoopsDemo {

  def main(args: Array[String]): Unit = {

    var x: Int = 1
    var y: Int = 1

    do{
      println("value of x = " + x)
      x += 1

    }while(x < 10 )

    while ( y < 10) {
      println("value of y = " + y)
        y += 1
    }

    for (i <- 1 to 10){
      println("value of i = "+ i)
    }

    for (j <- 1 until  10){
      println("value of i = "+ j)
    }

    for (i <- 1 to 10; j <- 1 to 3){ // nested for loop
      println("("+ i +","+ j +")")
    }

    var lst: List[Int] = List(1, 2, 3, 4, 5, 6) // list is immutable

    for (value <- 1 to lst.length) println(value)
    for (value <- lst) println(value)

    println("for Loop with if conditions")
    for (value <- lst if value%2 ==0 ) println(value)

    val yeildValue = for (value <- lst if value%2 ==0 )  yield value
    // no { } while assinging to values


      println(yeildValue)

    val isListComprehension = for (value <- lst )  yield value * 2
    // no { } while assinging to values


    println(isListComprehension)

    //break

    import scala.util.control.Breaks._


    println("Testing break...")

    breakable{
      for (value <- lst ) {
        println(value)
        if (value == 4)
          break
      }
    }


  }
}
