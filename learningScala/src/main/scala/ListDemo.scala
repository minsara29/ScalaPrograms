object ListDemo {

  def main(args: Array[String]): Unit = {

    val list: List[Int] = List(1, 2, 3, 4, 5)
    val names: List[String] = List("Kannan", "Dahlia")

    var newlist = 0 :: list

    println(newlist)
    println(list)

    println(newlist(0))

    names.foreach(println)

    val array = list.toArray

    for (value <- array){
      println(value)
    }

    println(list.head)
    println(list.tail)
    println(list.tails)

    println(array.isEmpty)
    println(list.isEmpty)

    println(array.reverse)
    println(list.reverse)

    val what = list :: names

    println (what)

    println(List.fill(5)(1))

    var sum: Int = 0
    list.foreach(sum += _)
    println(sum)

    for (name <- names) {
      println(name)
      println("Pranav")
    }


  }

}
