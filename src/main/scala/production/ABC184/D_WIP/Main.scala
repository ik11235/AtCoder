package production.ABC184.D_WIP

object Main extends App {
  def exec2(a: Int, b: Int): Double = {
    if (a == 99 && b == 99) {
      return 1.0
    } else {
      ((exec2(a + 1, b) + 1) * 0.5) + ((exec2(a, b + 1) + 1) * 0.5)
    }
  }

  def exec3(a: Int, b: Int, c: Int): Double = {
    ???
  }

  val Array(a, b, c) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  if (List(a, b, c).count(_ == 0) == 2) {
    // 0 2つの場合
    println(100 - List(a, b, c).max)
  }
  else if (List(a, b, c).count(_ == 0) == 1) {
    val aa = List(a, b, c).max
    val bb = (List(a, b, c).sorted).apply(1)
    println(exec2(aa, bb))
    // 0 1つの場合
  } else {
    // 0 なし
    println(exec3(a, b, c))
  }
}
