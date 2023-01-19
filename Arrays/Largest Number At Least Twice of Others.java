/*
Largest Number At Least Twice of Others
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, print the index of the largest element, or print -1 otherwise.

Input Format
The first line of the input contains the number n(length of the array),

The next n space separated integers denote the elements of the array.

Output Format
Print the index of the element if it satisfies the condition else print -1

Example 1
Input

4
3 6 1 0
Output

1
Explanation

Largest element is 6, which is twice of next largest element 3, hence we print it's index which is 1.

*/

//1 Approch
import java.util.*;

public class Main {
    
    public static int LargestElement(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE;
		int ind = 0;
		for(int i = 0; i < n; i++){
			if(nums[i] > maxi){
				maxi = nums[i];
				ind = i;
			}
		}
		int smaxi = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			if(nums[i] > smaxi && ind != i){
				smaxi = nums[i];
			}
		}
		if(smaxi*2 > maxi)
			return -1;
		else
			return ind;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        n = sc.nextInt();
        
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(LargestElement(nums, n));
    }
}


//Second Approch

import java.util.*;

public class Main {
    
    public static int LargestElement(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE;
		int ind = 0;
		for(int i = 0; i < n; i++){
			if(nums[i] > maxi){
				maxi = nums[i];
				ind = i;
			}
		}
		for(int i = 0; i < n; i++){
			if(nums[i]*2 > maxi && ind != i){
				return -1;
			}
		}
		return ind;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        n = sc.nextInt();
        
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(LargestElement(nums, n));
    }
}
