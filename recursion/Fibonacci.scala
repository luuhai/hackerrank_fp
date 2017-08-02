object Solution {

  def fibonacci(x:Int):Int = {
    def calc(x: Int, fib1: Int, fib2: Int): Int = {
      x match {
        case a if (a == 0 || a == 1) => fib1
        case _ => calc(x - 1, fib2, fib1 + fib2)
      }
    }
    calc(x, 0, 1)
  }

  def main(args: Array[String]) {
    /** This will handle the input and output**/
    println(fibonacci(readInt()))

  }
}
