object CSVFileReader {

  def main(args: Array[String]): Unit = {

    val fileName = "data\\ages.csv"

    val lines = scala.io.Source.fromFile(fileName).getLines()

//    lines.foreach(println)
    for (line <- lines ){

      if (line != "name,age"){

        val Array(name:String, age:String) = line.split(',')
        val ageInt: Int = age.toInt

        println("Name: "+ name + ", Age: "+ ageInt)

      }

    }



  }

}
