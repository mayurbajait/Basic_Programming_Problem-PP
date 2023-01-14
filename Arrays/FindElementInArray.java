/*
1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing index at which d is found in array a and -1 if not found
*/

import java.io.*;
import java.util.*;

public class FindElementInArray{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] array = new int[size];
    
    for(int i = 0; i < array.length; i++){
        array[i] = sc.nextInt();
        
    }
    
    int find = sc.nextInt();
    int inf = -1;
    
    for(int i = 0; i < array.length; i++){
        if(array[i] == find){
            inf = i;
            break;
        }
    }
    System.out.println(inf);
 }

}
