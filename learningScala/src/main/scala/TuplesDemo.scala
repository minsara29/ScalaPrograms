object TuplesDemo {
  def main(args: Array[String]): Unit = {
    val tuple1 = (1, "Kannan", true)

    val tuple2 = new Tuple4('1', "another way to declare", "max22", (2,3))
    val tuple3 = new Tuple2('1', "another way to declare tupl2 1.2.3...22")

    println(tuple1)

    println(tuple2)
    println(tuple3)

    println(tuple1._1)
    println(tuple1._2)
    println(tuple1._3)

    tuple2.productIterator.foreach{
      i => println(i)
    }

    println(tuple2._4._1)

  }



}
