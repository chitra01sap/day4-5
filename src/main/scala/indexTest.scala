//find the last element of list with its index value

object indexTest {
  def main(args:Array[String]): Unit ={

    val list = List(1,2,3,4,5,6)
    val last_element = list(list.length-1)
    println("given list is :" + list)
    println("last element of list is :" + last_element)

  }

}
