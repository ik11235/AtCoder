package production.ABC144.C_WIP

object Main extends App {

  import scala.math.sqrt

  def isPrime(num: Long): Boolean = {
    if (num == 1 || num % 2 == 0) {
      false
    } else {
      (3L to sqrt(num).toLong by 2).forall {
        e => num % e != 0
      }
    }
  }

  val n = scala.io.StdIn.readLine.toLong
  var ans = n - 1
  if (!isPrime(n)) {
    var a = 2L
    while (n % a != 0) {
      a += 1
    }
    var b = n / a

    var flag = true
    while (flag) {
      if (a - 1 + b - 1 < ans) {
        ans = a - 1 + b - 1
      }
      if (isPrime(b)) {
        flag = false
      } else {
        var aa = 2L
        while (b % aa != 0) {
          aa += 1
        }
        a = a * aa
        b = b / aa
      }
    }
  }

  println(ans)
}
