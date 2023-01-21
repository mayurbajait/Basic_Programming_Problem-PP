/*
Find First And Last
Given an array with possibly duplicate elements, find the first and last occurrences of a specified element.

Input Format
The first line contains an integer N denoting the number of elements.

The second line contains N space separated integers denoting the elements of the array.

The third line contains x, the element whose first and last occurrences are to be found.

Output Format
Print two integers denoting the first and last occurrence of the element. If it does not occur in the array, print -1 -1.

Example 1
Input

5
1 2 2 2 3
2
Output

1 3
*/
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Solution.findFirstAndLast(arr, n , x);
        
    
    }
}
class Solution 
{
    static void findFirstAndLast(int[] arr, int n,int x) 
    {
		int fo = 0;
		int lo = 0;

		for(int i = 0; i < n; i++){
			if(arr[i] == x){
				fo = i;
				break;
			}
		}
		for(int i = 0; i < n; i++){
			if(arr[i] == x){
				lo = i;
			}
		}
		if(fo == 0 && lo == 0){
			System.out.print("-1 -1");
		}
		else{
			System.out.print(fo + " " + lo);
		}
		
    }
}
