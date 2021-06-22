object FileHandlingDemo {

  def main(args: Array[String]): Unit = {


    val fileName = "data\\test.txt"

    var data = scala.io.Source.fromFile(fileName)

    data.foreach(print)

    var lines = scala.io.Source.fromFile(fileName).getLines()
    println(lines)

    lines.foreach(println)


    // writing the data into output file using PrintWriter

    import  java.io._

    val outputFile = "data\\output.txt"

    val file = new File(outputFile)

    val writter = new PrintWriter(file)

    writter.write("this file created based on the FileHandlingDemo modules\n")

    writter.close() // close is important .. otherwise no lines written in files

    println("Error is : " + writter.checkError()) // error handling in PrintWriter


    // writing the data into output file using FileWriter

    val outputFile1 = "data\\output1.txt"

    val file1 = new File(outputFile1)

    val writter1 = new FileWriter(file1)

    writter1.write("this file created based on the FileHandlingDemo modules\n")
    writter1.write("this is second lines \n")
    writter1.write("this is third lines \n")

    writter1.close() // close is important .. otherwise no lines written in files

    //we can use try catch block to handle the errors

    // writing the data into output file using FileWriter

    val outputFile3 = "data\\output2.txt"

    val file3 = new File(outputFile3)
    val writter3 = new FileWriter(file3)
    val bufferedWritter = new BufferedWriter(writter3)


    bufferedWritter.write("this file created based on the buffer write FileHandlingDemo modules\n")
    bufferedWritter.write("this is second lines \n")
    bufferedWritter.write("this is third lines \n")

    bufferedWritter.close() // close is important .. otherwise no lines written in files


  }
}
