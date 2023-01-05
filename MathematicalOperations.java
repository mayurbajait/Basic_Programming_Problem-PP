/*
Mathematical Operations
You are given two positive integers. You have to calculate the result of performing +,-,*,/,% operations on them.

Input Format
The first line of input contains two space separated integers A and B.

Output Format
The first line of the output should contain the sum of A and B.

The second line of the output should contain the difference of A and B.

The third line of the output should contain the product of A and B.

The fourth line of the output should contain the quotient of A divided by B.

The fifth line of the output should contain the remainder of A divided by B.

*/

import java.util.*;
public class MathematicalOperations {
  public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    mathOperations(a, b);
  }
  static void mathOperations(int a, int b) {
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
  }
}
