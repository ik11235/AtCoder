package production.ABC130.A

object Main extends App {
  val Array(x,a) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  if(x<a){
    println(0)
  } else {
    println(10)
  }
}
