object IfElseConditionDemo {

  def main(args: Array[String]): Unit = {

    var x: Int = 10

    if (x > 15 ) {
      println("x is greater than 15")
    } else if (x < 15 ){
      println("x is less than 15")
    } else { // x==15
      println( "x is 15")
    }

  }

}
