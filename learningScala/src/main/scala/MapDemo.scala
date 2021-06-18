object MapDemo {

  def main(args: Array[String]): Unit = {

    val myMap: Map[Int, String] = Map(1 -> "kannan", 2 -> "dahlia")

    println(myMap)

    println(myMap(2))
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    myMap.keys.foreach { k =>
      println("key: " + k)
      println("value: " + myMap(k))
    }

    val map2: Map[Int, String] = Map(100 -> "Ramchi")

    println(myMap ++ map2)

    println(myMap.size)
  }

}
