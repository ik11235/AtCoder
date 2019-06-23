package production.ABC131.D

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  val ab = (1 to n).map { _ =>
    val Array(a, b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    (a, b)
  }.sortBy(_._2)

  //  println(ab)
  var now = 0L
  ab.foreach { aabb =>
    now += aabb._1
    if (now > aabb._2) {
      println("No")
      sys.exit
    }
  }

  println("Yes")
}
