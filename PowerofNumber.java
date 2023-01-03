/* Find power of a number

Ninja is sitting in an examination hall. He is encountered with a problem statement,
"Find ‘X’ to the power ‘N’ (i.e. ‘X’ ^ ‘N’). Where ‘X’ and ‘N’ are two integers."
Ninja was not prepared for this question at all, as this question was unexpected in the exam.
He is asking for your help to solve this problem. Help Ninja to find the answer to the problem.

*/

import java.util.*;

public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt ();
    int n = sc.nextInt ();
	  double ans = Math.pow(x, n);
	  int res = (int) ans;
    System.out.println(res);
  }
}
