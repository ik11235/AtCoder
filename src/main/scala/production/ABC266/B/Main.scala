package production.ABC266.B


object Main extends App {
  import scala.sys.exit

  val n = scala.io.StdIn.readLine.toLong
  (0 to 998244353).foreach { i =>
    if ((n - i) % 998244353 == 0) {
      println(i)
      exit(0)
    }

  }
}