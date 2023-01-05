/*
Even Sum
You are given a number N. Print sum of all even numbers from 1 to N.

Input Format
There is only an integer N.

Output Format
Return the sum as a single integer.
*/

import java.util.*;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
		long count = 0;
		for(long i = 1; i <= n; i++){
			if(i % 2 == 0){
				count= count+i;
			}
		}
        System.out.println(count);
    }
}
