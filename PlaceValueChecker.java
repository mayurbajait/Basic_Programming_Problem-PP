/*
Given a positive integer N. The task is to Create a function and return true or false according to the condition that whether zero is present at the second last place value or not.

You have to print the output in the calling function itself based on the boolean value you get in return from the function.

The output should be Yes or No.

Input Format
Input consists of a single line of integer n.

Output Format
Print Yes if the second last place value is 0 else No.

EXAMPLE 1
Input:

100
Output::

Yes
EXPLANATION:

0 is it's second last digit.

*/
import java.util.*;

public class PlaceValueChecker {

	static int FrequencyofDigits(long n, int d) {
        int c = 0;
		while(n>0){
			long dig = n%10;
			if(dig==d){
				c++;
			}
			n/=10;
		}
		return c;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        System.out.println(FrequencyofDigits(n, d));
    }
}
