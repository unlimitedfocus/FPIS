object ex2_1 {

  def fib2(n: Int): Int = {
    if (n == 0) 1
    else n * fib(n - 1)
  }

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(acc: Int, x: Int): Int = {
      if (x == 0) acc
      else loop(acc * x, x - 1)
    }

    loop(1, n)
  }

}
