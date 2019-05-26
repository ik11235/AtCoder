package practice.ABC127.D

object Main extends App {

  val Array(n, m) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  var a: Array[Long] = scala.io.StdIn.readLine.split(" ").map(_.toLong).sorted

  val bc = (1 to m).map { _ =>
    val Array(b, c) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

    (b, c.toLong)
  }.sortWith((o1, o2) => o1._2 > o2._2)

  var inx = 0
  bc.foreach { bbcc =>
    var cnt = bbcc._1
    val cc = bbcc._2
    while (cnt > 0 && inx < a.length && a(inx) < cc) {
      a.update(inx, cc)
      inx += 1
      cnt -= 1
    }
  }
  println(a.sum)
}