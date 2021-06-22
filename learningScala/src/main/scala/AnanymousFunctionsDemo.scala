object AnanymousFunctionsDemo {

  def main(args: Array[String]): Unit = {

    var list = List(1,2,3,4,5,6,7,8,9,0)

    var add = (x:Int, y:Int) => x+y

    println(add(2,3) )

    var result = list.filter(x=> x%2==0)
    println(result)

    result = list.filter(_%2==0)
    println(result)

    var squareOfNum = list.map(scala.math.pow(_,2))
    println(squareOfNum)


  }

}
