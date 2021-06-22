object IteratorDemo {

  def main(args: Array[String]): Unit = {

    val ite = Iterator("Jan", "Feb", "Mar", "Apr", "May")

    println(ite.next())
    println(ite.next())
    println(ite.next())
    println(ite.next())
    println(ite.next())
    //println(ite.next()) end of iterator

    println(ite.hasNext) // to avoid the error

    val ite1 = Iterator("Jan", "Feb", "Mar", "Apr", "May")

    println(ite1.max)


  }

}
