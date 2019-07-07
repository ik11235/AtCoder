package practice.ABC133.C

object Main extends App {
  val Array(l, r) = scala.io.StdIn.readLine.split(" ").map(_.toLong)

  var min = 2020
  val rr = List(r, l + 4040).min
  (l until rr).foreach { i =>
    (l + 1 to rr).foreach { j =>
      val aa = (i * j) % 2019
      if (aa < min) {
        min = aa.toInt
      }
    }

  }
  println(min)
}
