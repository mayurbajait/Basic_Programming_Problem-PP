/*

FACING THE SUN
Given an array h representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).

Input Format
line 1: contains an integer n denoting size of array.

line 2: contains n spaced integers denoting elements of array.

Output Format
Print a single integer denoting the number of buildings which will see the sunrise.

Example 1
Input

5
7 4 8 2 9
Output

3
Explanation

7 can watch the sunrise, 4 can't, then 8 can but 2 can't and lastly 9 can watch the sunrise too, hence 3 buildings can watch the sunrise.

*/

import java.util.*;

public class Main {
    public static int facingSun(int n, int arr[]) {
        int max = arr[0];	
		int count = 1;
		for(int i = 1; i < n; i++){
			if(arr[i] > max){
				max = arr[i];
				count++;
			}
		}		
		return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        System.out.println(facingSun(n,array));
    }
}
