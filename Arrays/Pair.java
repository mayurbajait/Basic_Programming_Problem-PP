/*
Pairs
Given an array of N integers, count the total pairs of integers that have a difference of K.

Input Format
1st line contains N & K (integers).

2nd line contains N numbers of the array.

Output Format
One integer - the number of pairs of numbers that have a difference K.

Example 1
Input

4 1  
32 0 63 8
Output

0
*/

import java.io.*;
import java.util.*;

class Solution {
    public int Pairs(int []arr,int k){
        int c = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i]-arr[j]==k || arr[j] - arr[i] == k){
					c++;
				}
			}
		}
		return c;
    }
}

public class Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.Pairs(arr,k)); 
    }
}
