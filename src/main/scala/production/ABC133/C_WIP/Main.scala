package production.ABC133.C_WIP

object Main extends App {


  val Array(l, r) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  var min = 2020
  (l until r).foreach { i =>
    if (min != 0) {
      var tmpmin = i * (i + 1) % 2019
      if (tmpmin < min) {
        min = tmpmin
      }
      val diff = i % 2019
      val maxdiff = diff * (r - i)
      if (maxdiff > 2019) {
        var tmp = maxdiff
        while (maxdiff >= 2019) {
          tmp = tmp - 2019
        }
        while (tmp >= diff) {
          tmp = tmp - diff
        }
        if (tmp < min) {
          min = tmp
        }
      }
    }
    // このループは厳しい
    /*
    (l + 1 to r).foreach { j =>

    }
     */
  }
  println(min)
}
