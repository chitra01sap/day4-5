
import scala.collection.mutable

object queueWithListTest {

  def main(args:Array[String]): Unit ={

    val list = List(3445,786,23,8)
    val queue = mutable.Queue[Int]()
    for(l <- list){
      queue.enqueue(l)
    }
    println("given list is :" + list)
    println("queue after insertion:" +queue)

  }
}
