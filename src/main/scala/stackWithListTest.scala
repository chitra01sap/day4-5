import scala.collection.mutable

object stackWithListTest {

  def main(args:Array[String]): Unit ={
    val stack = mutable.Stack[Int]()
    val l1 = List[Int](5,6,7)
    println("given list is :"+ l1)
    stack.pushAll(l1)
    println("stack after pushing elements from list is :"+ stack)
  }
}
