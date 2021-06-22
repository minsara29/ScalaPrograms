object FunctionByValueName {

  def main(args: Array[String]): Unit = {
    exec(time)

  }

  def time(): Long={
    println("Entering time function")
    return System.nanoTime()
  }

//  def exec(t: Long): Long={ // Function By Value (passing as value so time executing first
  def exec(t: => Long): Long={ // Function by Name (passing as function)
    println("Entering exec function")
    println("Time" + t)
    println("Exiting exec function")
    t
  }

}


//Function By Value
//Entering time function
//Entering exec function
//Time1353677615086100
//Exiting exec function


//Function By Value
//Entering exec function
//Entering time function
//Time1353921337379500
//Exiting exec function
