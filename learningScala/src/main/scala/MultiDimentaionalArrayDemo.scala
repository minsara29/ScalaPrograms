import Array._

object MultiDimentaionalArrayDemo {

  def main(args: Array[String]): Unit = {

    val multiArray = ofDim[Int](3,3)

    for (i <- 0 to 2 ; j <- 0 to 2){
      multiArray(i)(j) = i+j
    }

    for (i <- 0 to 2 ; j <- 0 to 2){
      print(multiArray(i)(j) + ' ')
    }



  }

}
