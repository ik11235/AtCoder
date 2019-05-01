package practice.ABC125.D

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val a = scala.io.StdIn.readLine.split(" ").map(_.toLong)

  val minus = a.count(_ < 0)
  val aa = a.map(_.abs)
  if (minus % 2 == 0) {
    println(aa.sum)
  } else {
    println(aa.sum - (aa.min * 2))
  }
}
