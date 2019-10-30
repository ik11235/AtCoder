package production.ABC144.B

object Main extends App {
  val n = scala.io.StdIn.readLine.toInt
  var ans = false
  (1 to 9).foreach { i =>
    (1 to 9).foreach { j =>
      if (i * j == n)
        ans = true

    }
  }

  if (ans) {
    println("Yes")
  } else {
    println("No")
  }
}
