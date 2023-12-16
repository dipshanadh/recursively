public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("The 9th number of fibonacci sequence is");
    System.out.println(fib(9));
  }

  public static long fib(long n) {
    if (n == 0 || n == 1)
      return n;

    return fib(n - 1) + fib(n - 2);
  }
}
