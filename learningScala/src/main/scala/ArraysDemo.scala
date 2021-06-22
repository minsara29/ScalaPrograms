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
    a1.appended(10)
    for(x <- a1) { println(x)}


    val marks = Array(95, 85, 88, 99, 100)

    println("Print Average Marks...")
    println(marks.sum / marks.length)

    println("foreach...")
    marks.foreach(println)

    println("another Example of foreach...")
    var tot = 0
    marks.foreach(x=> tot += x )
    println("total = "+ tot)
    tot = 0
    marks.foreach(tot += _ ) // do samething
    println("total = "+ tot)


    println("Map Examples")

    var newMarks = marks.map(_+10).toArray

    newMarks.foreach(println)




  }

}
