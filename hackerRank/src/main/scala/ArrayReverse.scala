//Constraints
//
//where
//Sample Input
//
//STDIN                       Function
//  -----                       --------
//    9                           n = 9
//10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
//Sample Output
//
//3


import scala.io._

object ArrayReverse {
  def main(args: Array[String]) {
//    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

     sockMerchant(n, ar)

//    printWriter.println(result)
//
//    printWriter.close()
  }

  def sockMerchant(n: Int, ar: Array[Int]): Unit ={

    var ar1 = ar.sorted

    println(ar1)

    while (ar1.length > 0){
      val x = ar1.last
      ar1 = ar1.drop(x)
      println(x.toInt)

    }

  }


}
