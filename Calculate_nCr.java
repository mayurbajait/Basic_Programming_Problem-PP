/*

Calculate nCr
Given n and r, your task is to calculate nCr.

Here nCr is the total number of ways for selecting r elements out of n options are nCr = (n!) / (r! * (n-r)!) where n! = 1 * 2 * . . . * n.

Input Format
Input consists of one line having two integers n followed by r.

Output Format
We have to calculate nCr using the formula as given in the question.

Example 1
Input

5 2
Output

10

*/
import java.util.*;

public class Calculate_nCr {

    static long calculate_nCr(int n, int r) {
        long below = fact(r)*fact(n-r);
		long nCr = fact(n)/below;
		return nCr;
    }
	static long fact(int n){
		long fact = 1;
		for(int i = 1; i <= n; i++){
			fact = fact * i;
		}
		return fact;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.print(ans);
    }
}
