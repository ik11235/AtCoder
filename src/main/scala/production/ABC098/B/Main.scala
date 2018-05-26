package production.ABC098.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val s = scala.io.StdIn.readLine
  var cnt = 0
  (1 until n).foreach { x =>
    val s1 = s.take(x).toCharArray.toSet
    val s2 = s.takeRight(n - x).toCharArray.toSet
    cnt = List((s1 intersect s2).toList.size, cnt).max
  }
  println(cnt)
}
