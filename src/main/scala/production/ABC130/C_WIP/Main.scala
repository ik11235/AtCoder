package production.ABC130.C_WIP

object Main extends App {
  val Array(w, h, x, y) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  val ll = List(
    // 縦斬り
    List(x * h.toFloat, (w - x) * h.toFloat).min,
    // 横切り
    List(y * w.toFloat, (h - y) * w.toFloat).min,
    // 斜め切り
    (y + x) * (y * x) / 2.0,
    // 反対
    (w - (x - y)) * (h - (y - x)) / 2.0
  )
  val ans = ll.max

  val ans2 = if (x == y) {
    1
  }
  else {
    0
  }


  println(ans + " " + ans2)
}
