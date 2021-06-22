class Car{

  var cost: Int = 100
  private var tax: Float = 3.5f //private variable can be accessed within class
  protected var county_tax = 10.5f //protect can be used in class and its subclass

  def totalCost(): Double = {
    cost + tax + county_tax
  }

//  def example(a: Int): Int ={ // default is val
//    a += 1 // cannot re-assigned
//  }

}

class Baaa(val x: Int) extends Car{

}

object ClassDemo {
  def main(args: Array[String]): Unit ={

    var car = new Car
    println(car.totalCost())

    car.cost = 250

    println("modified value = " + car.totalCost())

    // car.tax = 200 // gives an error due to private key (can not be used outside of class)

    //var car.newfield: Int = 15 // give an error

//    print("creating new variable outside of the class : " + car.totalCost()+car.new)

    var car2 = new Car

    println("Car2 's Cost values :" + car2.cost)

//    println("Class variables test :" + Car.cost)
  }
}
