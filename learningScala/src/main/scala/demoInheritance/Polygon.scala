package demoInheritance

class Polygon {

  def area: Double = 0.0
}

object Polygon{
  def main(args: Array[String]): Unit = {

    var poly = new Polygon()
    printArea(poly)

    var rec = new Rectangle(10.0, 20.0)
    printArea(rec)

    var tri = new Triangle(10.0, 20.0)
    printArea(tri)


  }

  def printArea(p: Polygon) = println(p.area)

}