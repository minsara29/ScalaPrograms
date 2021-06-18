object FunctionMapFilterDemo {

  val lst = List(1, 2, 4, 5, 5, 6, 7)

  val mymap: Map[Int, String] = Map(1 -> "Kannan", 2 -> "Dahlia")

  def main(args: Array[String]): Unit = {

    println(lst.map(_ * 2))

    println(lst.map(x => x * 3))

    println(mymap.map(x => println(x)))
    //    println(mymap.mapValues(x => 'Hi ' + x))


    println(List(List(1, 2, 3, 4, 5),
                  List(6, 7, 8, 9, 0)
                ).flatten)

    println(lst.flatMap(x => List(x, x+10)))


    println(lst.filter(x=> x%2 == 0 ))

  }

}