/*
Write a program to calculate the sum of first N natural numbers.
Note: Natural numbers are the numbers that start from 1 and end at infinity.
*/

import java.util.*;
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    
        int add = 0;
		for(int i = 1; i <= N; i++){
			add = add + i;
		}
		System.out.println(add);
    }
}
