/*
Plus Minus
Given an array arr of N integers, Calculate the ratios of its elements that are positive, negative, and zero to the array size N.

Print the decimal value of each fraction in a new line up to 6 decimal places.

Input Format
The first line contains an integer N, the size of the array.

The second line contains N space-separated integers representing the array arr.

Output Format
Print the 3 required ratios up to 6 decimal places.

Example 1
Input

6
-4 3 -9 -5 4 1
Output

0.500000
0.500000
0.000000
Explanation

There are 3 positive integers, 3 negative integers, and 0 zeroes in the array.

The ratio of occurrence is - Positive: 0.500000, Negative: 0.500000, and Zeroes: 0.000000
*/

import java.util.*;


public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        printRatios(arr);
        sc.close();
    }

    public static void printRatios(int[] arr) {

		double cp = 0;
		double cn = 0;
		double zero = 0;
		double len = arr.length;
		
		for(int i  = 0; i < arr.length; i++){
			if(arr[i]>0){
				cp++;
			}
			else if(arr[i]<0){
				cn++;
			}
			else{
				zero++;
			}
		}
        
		double a1 = cp/len;
		double a2 = cn/len;
		double a3 = zero/len;

		System.out.println(String.format("%.6f", a1));
		System.out.println(String.format("%.6f", a2));
		System.out.println(String.format("%.6f", a3));
		
    }
}
