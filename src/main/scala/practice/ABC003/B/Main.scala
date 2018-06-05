package practice.ABC003.B

object Main extends App {
  val s = scala.io.StdIn.readLine
  val t = scala.io.StdIn.readLine
  val list = "atcoder"
  if ((0 until s.length).count(
        i =>
          s(i) == t(i) ||
            (s(i) == '@' && list.contains(t(i))) ||
            (t(i) == '@' && list.contains(s(i)))) == s.length) {
    println("You can win")
  } else {
    println("You will lose")
  }
}
