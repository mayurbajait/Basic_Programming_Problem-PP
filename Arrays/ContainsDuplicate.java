/*
Contains Duplicate
Given an array arr with n positive integers. Find if the array contains any duplicates.

Input Format
The first line of input contains the integer n.

The last line contains n spaced integers.

Output Format
For each test case print true if duplicates are present or print false if duplicates are not present.

Example 1
Input

4
1 2 3 1
Output

true
Explanation

1 is duplicate here.

*/

import java.util.*;

class Accio {
    public void duplicates(int[] arr) {
       boolean b = false;
		for(int i = 0; i < arr.length; i++){
			for(int j = 1+i; j < arr.length; j++){
				if(arr[i]==arr[j]){
					b = true;
                    break;
				}
			}
			if(b == true){
				break;
			}
		}
		if(b == true){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
 
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        Obj.duplicates(arr);
        sc.close();
    }
}
