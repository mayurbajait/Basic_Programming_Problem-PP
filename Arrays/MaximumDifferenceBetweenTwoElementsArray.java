/*
Maximum difference between two elements in an Array
Write a program to find out the maximum difference between any two element in an array.
Note: if an element is arr[i] and another element is arr[j] then difference will be |arr[i]-arr[j]| .

Input Format
First line contains n size of the array.

Second line contains n elements of the array. Elements will always be positive integers.

n will always be greater than 1.

Output Format
Print the maximum difference between any two element of an array.

Example 1
Input

4
16 24 89 35
Output

73
Explanation

Maximum possible difference is in pair (16,89) which is 73


*/

import java.io.*;
import java.util.*;

public class MaximumDifferenceBetweenTwoElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        ArrayProblem(arr);  
    }

    public static void ArrayProblem(int []arr) {
        int min = arr[0];
        int max = arr[0];

		for(int i = 0; i<arr.length; i++){
		    if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
        }
		int diff = max-min;
		System.out.println(diff);
    }
}
