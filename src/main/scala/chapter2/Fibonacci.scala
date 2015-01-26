package chapter2

object Fibonacci {
  def calculate(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, acc: Int, last: Int) : Int = {
      if(n < 1) {
        acc
      } else {
        loop(n-1, acc + last, acc)
      }
    }
    loop(n, 0, 1)
  }
}
