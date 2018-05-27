package practice.ABC001.C

object Main extends App {
  def getDir(deg: Int, w: Int): String = {
    if (w == 0) {
      "C"
    } else {
      deg.toDouble match {
        case d if d >= 3262.5 && d < 3487.5 =>
          "NNW"
        case d if d >= 3037.5 && d < 3262.5 =>
          "NW"
        case d if d >= 2812.5 && d < 3037.5 =>
          "WNW"
        case d if d >= 2587.5 && d < 2812.5 =>
          "W"
        case d if d >= 2362.5 && d < 2587.5 =>
          "WSW"
        case d if d >= 2137.5 && d < 2362.5 =>
          "SW"
        case d if d >= 1912.5 && d < 2137.5 =>
          "SSW"
        case d if d >= 1687.5 && d < 1912.5 =>
          "S"
        case d if d >= 1462.5 && d < 1687.5 =>
          "SSE"
        case d if d >= 1237.5 && d < 1462.5 =>
          "SE"
        case d if d >= 1012.5 && d < 1237.5 =>
          "ESE"
        case d if d >= 787.5 && d < 1012.5 =>
          "E"
        case d if d >= 562.5 && d < 787.5 =>
          "ENE"
        case d if d >= 337.5 && d < 562.5 =>
          "NE"
        case d if d >= 112.5 && d < 337.5 =>
          "NNE"
        case _ =>
          "N"
      }
    }
  }

  def getW(dis: Int): Int = {
    val ww = BigDecimal((dis * 10) / 60.0).setScale(0, scala.math.BigDecimal.RoundingMode.HALF_UP)
    ww.toInt match {
      case s if s >= 327 =>
        12
      case s if s >= 285 =>
        11
      case s if s >= 245 =>
        10
      case s if s >= 208 =>
        9
      case s if s >= 172 =>
        8
      case s if s >= 139 =>
        7
      case s if s >= 108 =>
        6
      case s if s >= 80 =>
        5
      case s if s >= 55 =>
        4
      case s if s >= 34 =>
        3
      case s if s >= 16 =>
        2
      case s if s >= 3 =>
        1
      case s =>
        0
    }
  }

  val Array(deg, dis) = scala.io.StdIn.readLine.split(" ").map(_.toInt)

  val w = getW(dis)
  val dir = getDir(deg, w)

  println(s"$dir $w")
}
