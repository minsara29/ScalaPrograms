import scala.collection.mutable.Set

object SetsDemo {

  def main(args: Array[String]): Unit = {

    //set will not have duplicate
    // contain multiple type

    val set :Set[Int] = Set(1, 2, 3, 4, 5, 5)


    println(set)

//    var mutableSet :scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1,2,3,4,5)
    val mutableSet = Set[Int](1, 2, 3, 4, 5, 5)

    println(mutableSet)

    println(set.head)
    println(set.tail)
    println(set.isEmpty)

    val set2: Set[Int] = Set(10, 5, 20, 1, 30)

    println(set.++(set2))
    println(set ++ set2 )

    println(set.intersect(set2))
    println(set.&(set2))

    set.foreach(println)
    for (value <- set) println(value)

  }

}
