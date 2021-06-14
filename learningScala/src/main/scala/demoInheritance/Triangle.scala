package demoInheritance

class Triangle (var hight: Double, var width: Double) extends Polygon{

  override def area(): Double = hight * width / 2

}
