//Option returns some or None

object demoOptions {

  def main(args: Array[String]): Unit = {

    val lst = List(1, 2, 4, 5, 5, 6, 7)

    val map: Map[Int, String] = Map(1 -> "Kannan", 2 -> "Dahlia")

    println(lst)
    println(map)

    println(lst.find( _ > 2))
    println(lst.find( _ > 2).get)
    println(map.get(3))
    println(map.get(3).getOrElse(0))
//    println(map.get(3).get)
    println(map.get(3).getOrElse())
    println(map.get(3).getOrElse("Unknown"))
    println(map.get(1).get)

    val opt: Option[Int] = None

    println(opt)

    val opt1: Option[Int] = Some(5)

    println(opt1.isEmpty)
    println(opt1.get)
  }

}
