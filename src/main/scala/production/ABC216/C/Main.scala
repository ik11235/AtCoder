package production.ABC216.C

object Main extends App {

  def exec(n: BigInt): String = {
   // println(n)
    if (n == 0) {
      return "";
    }
    if (n == 1) {
      return "A";
    }
    if (n == 2) {
      return "AA";
    }
    if (n == 3) {
      return "AAA";
    }
    if (n == 4) {
      return "AAB";
    }

    if (n % 2 == 0) {
      return exec(n / 2) + "B"
    } else {
      return exec((n - 1) / 2) + "BA"
    }
  }

  val n = scala.io.StdIn.readLine

  println(exec(BigInt(n)));
}
