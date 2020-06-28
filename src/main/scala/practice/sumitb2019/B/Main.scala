package practice.sumitb2019.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val ans = {
    //println(n / 1.08)
    val tmp = (n / 1.08).toInt
    if ((tmp * 1.08).toInt == n) {
      tmp.toString
    } else {
      if (((tmp - 1) * 1.08).toInt == n) {
        (tmp - 1).toString
      } else if (((tmp + 1) * 1.08).toInt == n) {
        (tmp + 1).toString
      }
      else {
        ":("
      }
    }
  }

  println(ans)
}
