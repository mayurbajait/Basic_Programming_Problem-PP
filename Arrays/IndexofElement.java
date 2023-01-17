/*
Index of Element
You are given an integer array Arr of size N and a number X. You need to print all the indexes of the given X in the array, else print -1.

Note : You have to give output in 1-based indexing.

Input Format:

The first line of input contains N and X representing the number of elements and the number whose indexes is to be given respectively.

The second line of input contains N space separated integers, representing elements of the array Arr.

Output Format:

Print the indexes of number X in the array Arr, else print -1.

Example 1:

Input

5 1
2 1 3 1 1
Output:

2 4 5
Explanation:

1 is present at index 2, 4 and 5.
*/

import java.util.*;

public class IndexofElement {
    public static void IndexOfElement(int N, int X, int[] arr){
		boolean flag = false;
		for(int i = 0; i < N; i++){
            if(arr[i]==X){
				System.out.print(i+1 + " ");
				flag = true;
			}
        }
		if(flag==false){
			System.out.print(-1);
		}
    }
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int arr[]=new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        IndexOfElement(N,X,arr);
    }
}
