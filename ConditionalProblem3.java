/*
Conditional Problem 3
You are provided with a number n.

Your task is to return a string according to the following conditions:

If the number is greater than 1, then return You entered more
If the number is less than or equal to 1 then return You entered less

Input Format
First line contains a positive integer n.

Output Format
Return the output as per instruction in the input.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

		if(n>1){
			System.out.println("You entered more");
		}
		else if(n<=1){
			System.out.println("You entered less");
		}
    }
}
