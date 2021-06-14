package demoInheritance

class Rectangle(var hight: Double, var width: Double) extends Polygon{

    override def area(): Double = hight * width

  }
