package journal

class Circle {

  var radius = 0 //since it public
                // scala creates two method reader 'radius' writter 'radius_='
  def draw(): Unit ={
    println("Drwaing the circle of radius" + radius)
  }

}

//How to add the validation
class Circle1 {

  private var pRadius = 0 //since it private
                          // scala creates two method reader 'private pRadius' writter 'private pRadius_='

  def draw(): Unit ={
    println("Drwaing the circle of radius" + radius)
  }

  //Custom function
  // Reader method
  def radius = pRadius

  // Writer method
  def radius_=(r:Int)={
    if (r<0) throw new Exception("-ve no allowed") else pRadius = r
  }

}


object FieldValidationInClass extends App {

  val c = new Circle

  println(c.radius)

  c.radius_=(20) //setter method scala provide defaultly
  println(c.radius)

  val c1 = new Circle1

  println(c1.radius)
  c1.radius = 30 //radius_ get called
  println(c1.radius)

//  c1.radius = -30 //radius_ get called
//  println(c1.radius) throw the exception



}
