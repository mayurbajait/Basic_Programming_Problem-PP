/*

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A bar chart of asteriks representing value of array a

Sample Input
5
3
1
0
7
5
Sample Output
* 	* 	* 	
* 	

* 	* 	* 	* 	* 	* 	* 	
* 	* 	* 	* 	* 		

*/

import java.io.*;
import java.util.*;

public class NoobBarChart{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr [] = new int [n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= arr[i]; j++) {
                System.out.print("*\t"); 
            }
            System.out.println();
        }
        
     }

}
