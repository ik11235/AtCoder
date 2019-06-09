package production.ABC129.D

object Main extends App {


  val Array(h, w) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  val s = (1 to h).map { _ => scala.io.StdIn.readLine }

  var ruisekihidari = Array.ofDim[Int](h, w)
  var ruisekimigi = Array.ofDim[Int](h, w)
  var ruisekiue = Array.ofDim[Int](h, w)
  var ruisekisita = Array.ofDim[Int](h, w)

  var ans = 0

  (0 until h).foreach { i =>
    (0 until w).foreach { j =>
      // 左計算
      if (j == 0) {
        // 一番左
        ruisekihidari(i)(j) = 0
      } else if (s(i)(j - 1) == '#') {
        ruisekihidari(i)(j) = 0
      } else {
        ruisekihidari(i)(j) = ruisekihidari(i)(j - 1) + 1
      }

      //逆でやらないと行けない
      // 右計算
      val ii = h - i - 1
      val jj = w - j - 1
      // println(ii + ":" + jj)

      if (jj == w - 1) {
        // 一番右
        ruisekimigi(ii)(jj) = 0
      } else if (s(ii)(jj + 1) == '#') {
        ruisekimigi(ii)(jj) = 0
      } else {
        ruisekimigi(ii)(jj) = ruisekimigi(ii)(jj + 1) + 1
      }

      // 上計算
      if (i == 0) {
        // 一番上
        ruisekiue(i)(j) = 0
      } else if (s(i - 1)(j) == '#') {
        ruisekiue(i)(j) = 0
      } else {
        ruisekiue(i)(j) = ruisekiue(i - 1)(j) + 1
      }

      // 下計算
      //逆でやらないと行けない
      if (ii == h - 1) {
        // 一番右
        ruisekisita(ii)(jj) = 0
      } else if (s(ii + 1)(jj) == '#') {
        ruisekisita(ii)(jj) = 0
      } else {
        ruisekisita(ii)(jj) = ruisekisita(ii + 1)(jj) + 1
      }
    }
  }
  /*
    println(ruisekihidari.deep)
    println(ruisekimigi.deep)
    println(ruisekiue.deep)
    println(ruisekisita.deep)
   */
  (0 until h).foreach { i =>
    (0 until w).foreach { j =>
      if (s(i)(j) != '#') {
        val tmp = 1 + ruisekihidari(i)(j) + ruisekimigi(i)(j) + ruisekiue(i)(j) + ruisekisita(i)(j)
        ans = List(ans, tmp).max
      }
    }
  }

  println(ans)
}
