package production.ABC131.C

object Main extends App {
  val Array(a, b, c, d) = scala.io.StdIn.readLine.split(" ").map(_.toLong)


  def oldans() = {
    //    println((a to b).toList)
    //    println("LCM:" + lcm(c, d))
    // cの倍数でない
    println(b / c)
    // dの倍数でない
    println(b / d)
    // cとdの倍数を二回引いているので1回たす
    println(b / lcm(c, d))

    // a以下の↑の数を引く


    // ---
    //cの倍数の数
    println(a / c)
    // dの倍数の数
    println(a / d)
    // cとdの倍数の数
    println(a / lcm(c, d))


    // cの倍数の数
    // a - (a / c) - (a / d) + (a / (c * d))
    (b - (b / c) - (b / d) + (b / lcm(c, d))) - (a - (a / c) - (a / d) + (a / lcm(c, d)))
    //-6 + -5 + 1
    //40 - (10個 - 1 1 1

    // List(10, 11, 13, 14, 15, 17, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 31, 33, 34, 35, 37, 38, 39)
    //List(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40)

    // bまでの削除数
    //-(6 + 5 -1) => -10
    // aまでの削除数
    // (1 + 1 + 0) => 2
    //-(10 -2)
    // => -8 これが削除される倍数の数
    //=> b - 削除数 - (a - 1)

    val aa = a - 1

    println((b / c) + (b / d) - (b / lcm(c, d)))
    println((aa / c) + (aa / d) - (aa / lcm(c, d)))
    println((aa - 1))

    b - ((b / c) + (b / d) - (b / lcm(c, d)) - ((aa / c) + (aa / d) - (aa / lcm(c, d)))) - aa
  }

  val ans = {
    val aa = a - 1

    //println((b / c) + (b / d) - (b / lcm(c, d)))
    //println((aa / c) + (aa / d) - (aa / lcm(c, d)))
    //println((aa - 1))

    b - ((b / c) + (b / d) - (b / lcm(c, d)) - ((aa / c) + (aa / d) - (aa / lcm(c, d)))) - aa
  }

  println(ans)

  def gcd(a: Long, b: Long): Long = {
    if (b == 0) a else gcd(b, a % b)
  }

  def lcm(m: Long, n: Long): Long = {
    m * n / gcd(m, n)
  }
}
