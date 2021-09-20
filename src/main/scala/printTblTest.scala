// Print the table of each element in the List

object printTblTest {

  def main(args: Array[String]): Unit = {
  val list = List(1, 2, 3, 4)
    for( a <- list){
      for( b <- 1 to 10){

          println(a * b)
      }
      println("\n")
    }
  }
}
