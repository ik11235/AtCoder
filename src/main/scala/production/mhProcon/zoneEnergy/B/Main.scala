package production.mhProcon.zoneEnergy.B

object Main extends App {

  def isPrime(i: Int): Boolean = {
    if (i == 1) return false
    (2 until i).foreach { xx =>
      if (i % xx == 0) {
        //  println("false:" + i)
        return false
      }
    }
    //println("true:" + i)

    true
  }

  println((0 until 20).map { _ =>
    val n = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    val x = n.count(isPrime)
    println(x)
    x
  }.sum)
}
