import java.util.*;

public class MemoizedFibonacci {
  private static Map<Integer, Integer> memo = new HashMap<>();

  static {
    memo.put(0, 0);
    memo.put(1, 1);
  }

  public static void main(String[] args) {
    System.out.println("The 20th number of fibonacci sequence is");
    System.out.println(fib(20, memo));
  }

  public static int fib(int n, Map<Integer, Integer> memo) {
    if (memo.containsKey(n))
      return memo.get(n);

    int result = fib(n - 1, memo) + fib(n - 2, memo);

    memo.put(n, result);

    return result;
  }
}
