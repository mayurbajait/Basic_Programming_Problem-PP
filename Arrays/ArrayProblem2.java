/*
Array Problem 2
Write a program to count the elements in an array which are greater than 35.

Input Format:
First line contains n, the size of an array.

Next line contains n-spaced integers representing array arr.

Output Format:
Print the number of the elements present in the array which are greater than 35.

Example 1
Input

5
12 67 89 16 23
Output

2
Explanation

67 and 89 are greater than 35. Hence, the output is 2.
*/
import java.util.*;

public class ArrayProblem2 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem2(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem2(int n, int[] arr){
        int c = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]>35){
				c++;
			}
		}
		return c;
    }
}
