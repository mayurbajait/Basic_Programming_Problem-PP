/*

2nd Largest from array
Given an unsorted array of size N with distinct elements. Find the 2nd largest element from the array without sorting the array.

Input Format
The first line contains a single integer N.

The second line consists of N integers of the array.

Output Format
Print the second largest number in the new line.

Example 1
Input

6
3 2 1 5 6 4
Output

5
Explanation

5 is the second largest element of the array.



*/
import java.io.*;
import java.util.*;


public class 2ndLargestFromArray {
    public static void SecondLargest(int[] arr, int n) {
		int fmx = Integer.MIN_VALUE, idx = -1;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > fmx){
				fmx = arr[i];
				idx = i;
			}
		}
		int smx = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > smx   && idx != i) {
				smx = arr[i];
			}
		}
		System.out.println(smx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
}
