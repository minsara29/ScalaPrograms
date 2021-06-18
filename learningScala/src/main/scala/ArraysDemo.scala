object ArraysDemo {

  def main(args: Array[String]): Unit = {

    val a1 = new Array[Int](10)
    val a2: Array[Int] = new Array[Int](10)
    var a3 = Array(1, 2, 3, 4, 5, 7, 8, 9, 0)

    a1(0) = 0
    a1(1) = 10
    a1(2) = 20
    a1(3) = 30
    a1(4) = 40
    for(x <- a1) { println(x)}



  }

}
