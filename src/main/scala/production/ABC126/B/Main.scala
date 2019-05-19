package production.ABC126.B

object Main extends App {
  val s = scala.io.StdIn.readLine

  s.substring(0, 2).toInt match {
    case ss if ss >= 1 && ss <= 12 =>
      // まだyy mmありえる
      s.substring(2, 4).toInt match {
        case sss if sss >= 1 && sss <= 12 =>
          println("AMBIGUOUS")
        case sss =>
          println("MMYY")
      }
    case ss =>
      // yy 以外ありえない
      s.substring(2, 4).toInt match {
        case sss if sss >= 1 && sss <= 12 =>
          println("YYMM")
        case sss =>
          println("NA")
      }
  }
}
