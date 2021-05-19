case class Cars(name: String, model: String){
  var carName = name
  var carModel = model

  def display(): Unit ={
    println(s"the Car's name is ${carName} and the model is ${carModel}")
  }
}

object DemoCaseClass {
  def main(args: Array[String]): Unit = {

    var nissan = Cars("Nissan", "Rogue") //since case class, no new required
    nissan.display()

    nissan match {  //pattern match
      case Cars(a, b ) => { println(a,b)}
    }

    val toyota = nissan.copy(name = "toyota") // copy details from other objects' values
    toyota.display()

    println(nissan == toyota) // Equals validation of two objects

    println(nissan) // toString function equalent __str__

    // pattern

    var BMW = Cars("BMW", "Corolla")
    var honda = Cars("Honda", "Civic")
    var other = Cars("Unknown", "unknown")

    matchPattern(BMW)
    matchPattern(other)
  }

  def matchPattern(car: Cars): Unit ={
    car match {
      case Cars("Nissan", "Rogue") => println("Yep, its a Nissan")
      case Cars("Honda", "Civic") => println("Yep, its a Honda")
      case Cars("BMW", "Corolla") => println("Yep, its a Corolla")
      case cars: Cars => println(" its a Unknown")
    }
  }
}
