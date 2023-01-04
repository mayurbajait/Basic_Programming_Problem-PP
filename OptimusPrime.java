/* Given an integer n, print all prime numbers between 1 and n (both inclusive).

Example:

If n = 8, your program should output all prime numbers between 1 and 8. Thus, it should output:

2
3
5
7

*/

import java.util.*;

public class OptimusPrime{
    static void findPrimesUntilN(int n) {
    int i, j;
    boolean isPrime = true;

    for (i = 2; i <= n; i++) {
      int sqrt = (int) Math.sqrt(i);
      for (j = 2; j <= sqrt; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) System.out.println(i);
      isPrime = true;
    }
  }
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimesUntilN(n);
    }
}
