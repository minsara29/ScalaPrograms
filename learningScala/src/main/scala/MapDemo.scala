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

    var cars = Map("toyota"->5000, "nissan"->10000, "other"->25000)

    cars.foreach(x=>println("key is: " + x._1 + "Value is: "+ x._2  ))

    cars.foreach{case(x,y)=>println("key is: " + x + "Value is: "+ y )}

    println(cars.get("toyota"))

    println(cars.getOrElse("toyota", "Unknown"))
    println(cars.getOrElse("to0yota", "Unknown"))

    println(cars.contains("toyota"))
    var car2 = cars.exists(x=> x._1 == "toyota") // return true or false
    println(car2)

    car2 = cars.valuesIterator.exists(_.equals(10000)) // return true or false ON VALUES
    //  valueIterator is for values
    println(car2)


    var car1 = Map("toyota"->"corolla", "nissan"->"rogue", "other"->"550cc").withDefaultValue("null")
    //to avoid the error like default dict
    println(car1("kannan"))

    var car3 = Map("toyota"->"corolla", "nissan"->"rogue", "other"->"550cc")
    val car4 = car3.view.mapValues(v=>v.toUpperCase) //car3.mapValues is deprecated
    car4.foreach(println)

    var car5 = cars.map(x=> x._2+100)
    println(car5)

    var car6 = cars.map{case(a,b)=> (a, b+1000)} // Map(toyota -> 6000, nissan -> 11000, other -> 26000)
    println(car6) // making new Map including key and value

    var car7 = cars.transform{case(a,b)=> b+1000} // Map(toyota -> 6000, nissan -> 11000, other -> 26000)
    println(car7) // using existing key and transform the values

    //MapValues return new Map
    //Transform change the existing one  on Mutalble


    import scala.collection.immutable.SortedMap

    var sortedCar7  = SortedMap[String, Int]() ++ cars //concat

    println(sortedCar7)



  }

}
