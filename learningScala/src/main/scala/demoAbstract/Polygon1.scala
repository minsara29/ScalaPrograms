package demoAbstract
//abstact class cannot be initiated
abstract class Polygon1 {

  def area: Double
}

object Polygon1{
  def main(args: Array[String]): Unit = {

    //var poly = new Polygon() // cannot be initiated
    //printArea(poly)

    var rec = new Rectangle1(10.0, 20.0)
    printArea(rec)

    var tri = new Triangle1(10.0, 20.0)
    printArea(tri)


  }

  def printArea(p: Polygon1) = println(p.area)

}