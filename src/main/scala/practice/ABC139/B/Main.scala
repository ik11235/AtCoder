package practice.ABC139.B

object Main extends App {
  val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var aa = 1
  var cnt = 0
  while (aa < b) {
    cnt += 1
    aa += (a - 1)
  }
  println(cnt)
}
