/*

Rotate array
Given an array with N elements, the task is to rotate the array to the left by K steps, where K is non-negative.

Input Format
The first line contains an integer N representing the size of the array.

The second line contains N space-separated integers representing the elements of the array.

The last line contains an integer K representing the number of times the array has to be rotated in the left direction.

Output Format
The only line of the output prints N space-separated integers representing the Rotated array elements.

Example 1
Input

8
7 5 2 11 2 43 1 1
2
Output

2 11 2 43 1 1 7 5
Explanation

Rotate 1 steps to the left: 5 2 11 2 43 1 1 7

Rotate 2 steps to the left: 2 11 2 43 1 1 7 5

*/

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // No. of times to rotate
        rotateArray(arr, n, k);
    }

    public static void rotateArray(int arr[], int n, int k) {
        int b [] = new int [n];

		int ic = 0;
		for(int i = 0; i < n; i++){
			if(k+i < n){
				b[i] = arr[k+i];
			}
			else if(ic < k){
				b[i] = arr[ic];
				ic++;
			}
		}
		for(int ba : b)
			System.out.print(ba + " ");
    }

}

