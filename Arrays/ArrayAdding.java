// Java program to sum two numbers
// represented two arrays.

/*
Array Adding
You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.

You are required to add the numbers represented by two arrays and print the arrays. n1 and n2 are of diferent size

Input Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2

Output Format
Add the two numbers and print the array

Example 1
Input

3
1 2 3
3
3 2 1
Output

4
4
4
Explanation

Adding corresponding elements gives 4 at each index -> 1 + 3 = 2 + 2 = 3 + 1 = 4
*/

import java.util.*;

public class ArrayAdding {
  static int[] calSum(int a[], int b[], int n, int m) {

	  int temp [] = new int [n+m];

	  int i = n-01, j = m-1, idx = 0;
	  int carry = 0;
	  
	  while(i >= 0 && j >= 0){
		  int sum = a[i] + b[j] + carry;
		  int val = sum%10;
		  carry = sum/10;
		  temp[idx] = val;
		  idx ++;
		  i--; j--;
	  }
	  while(i >= 0){
		  int sum = a[i] + carry;
		  int val = sum%10;
		  carry = sum/10;
		  temp[idx] = val;
		  idx ++;
		  i--;
	  }
	  while(j >= 0){
		  int sum = b[j] + carry;
		  int val = sum%10;
		  carry = sum/10;
		  temp[idx] = val;
		  idx ++;
		  j--;
	  }
	  while(carry > 0){
		  temp[idx] = carry%10;
		  carry = carry/10;
		  idx ++;
	  }

	  int ans [] = new int [idx];
	  int ansidx = 0;
	  for(int x = idx-1; x >= 0; x--){
		  ans[ansidx] = temp[x];
		  ansidx++;
	  }
	  return ans;
	  
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}
