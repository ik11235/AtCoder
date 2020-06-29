package practice.panasonic2020.B

object Main extends App {
  val Array(h, w) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  val ans = {
    val min = List(h, w).min
    val max = List(h, w).max
    if (min == 1) {
      1
    } else {
      // 偶数, 偶数
      if (min % 2 == 0 && max % 2 == 0) {
        (BigInt(h) * w) / 2
      } else if (min % 2 != 0 && max % 2 != 0) {
        // 奇数, 奇数
        ((BigInt(h) * (w - 1)) / 2) + (BigInt(h) / 2) + 1
      } else {
        // 奇数, 偶数
        (BigInt(h) * w) / 2
      }
    }
  }


  println(ans)
}
