/*
You are given a number. Your task is to find the sum of all the digits in the number.

Input Format
The only line of input contains a number.

Output Format
Print the sum of digits of the given number.

Example 1
Input

1873
Output

19
Explanation

1+8+7+3 = 19. Hence the output should be 19.
*/

import java.util.*;

class SumofDigits {
    static int sumDigit(int n)
    {
		int dig = 0;
		int count = 0;
        while(n>0){
			dig = n%10;
			count = dig+count;
			n = n/10;
		}
		return count;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.sumDigit(n));
    }
}
