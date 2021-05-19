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
  }
}
