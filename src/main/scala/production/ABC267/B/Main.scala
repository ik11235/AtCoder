package production.ABC267.B

object Main extends App {

  val s = scala.io.StdIn.readLine
  if (s(0) == '1') {
    println("No")
  } else {
    val arr = Array.fill[Boolean](7)(true)
    if (s(6) == '0') {
      arr(0) = false
    }
    if (s(3) == '0') {
      arr(1) = false
    }
    if (s(7) == '0' && s(1) == '0') {
      arr(2) = false
    }
    if (s(4) == '0' && s(0) == '0') {
      arr(3) = false
    }
    if (s(8) == '0' && s(2) == '0') {
      arr(4) = false
    }
    if (s(5) == '0') {
      arr(5) = false
    }
    if (s(9) == '0') {
      arr(6) = false
    }
    var ans = false
    //    println(arr.deep)
    for (i <- 0 to 5) {
      for (j <- i + 1 to 6) {
        if (arr(i) && arr(j)) {
          for (k <- i + 2 to j) {
            if (!arr(k)) {
              ans = true
            }
          }
        }
      }
    }
    if (ans) {
      println("Yes")
    } else {
      println("No")
    }
  }
}