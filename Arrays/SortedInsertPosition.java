*/*

Sorted Insert Position
Given a sorted array A and a target value B, return the index if the target is found. If not, print the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Input Format
Input consists of three lines.

The first line contains integer n

The second line contains n space-separated integers, each a value of arr[i].

The third line contains integer k

Output Format
Print the index where the element is present. If it's not present, print the index it would be inserted into the sorted array.

Example 1
Input

4
1 3 5 6 
5
Output

2
Explanation

5 is found at index 2

*/
  
  import java.io.*;
import java.util.*;

public class SortedInsertPosition {

    public static int searchInsert(int[] a, int b) {
        int index = a.length;

		for(int i = 0; i < a.length; i++){
			if(a[i]>=b){
				index = i;
				break;
			}
		}
		return index;
		
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(searchInsert(A,B));
    }
}
