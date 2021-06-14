object demoReduceFoldScan {

  def main(args: Array[String]): Unit = {
    val num: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val str: List[String] = List("A", "B", "C")


    println(num.reduce(_+_))

    println(num.reduceLeft( //left to right
      (x, y) => {println( x + "," + y)
                  x + y} ))


    println(num.reduceRight( //right to left
      (x,y) => {
        println( x + "," + y)
        x - y}))

    println(str.reduceLeft(_+_))

    //fold fuction pass the default value ; + work as same reduce

    println(num.foldLeft(100)(_+_))
    println(str.foldLeft("z")(_+_))

    //scan fuction pass the default value ; + work as same reduce but it give list of all values

    println(num.scanLeft(100)(_+_))
    println(str.scanLeft("z")(_+_))


  }

}
