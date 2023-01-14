/*
Span Of Array
Easy  Prev   Next
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max - min

*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    int size = sc.nextInt();
    int [] array = new int[size];
    
    for(int i = 0; i < array.length; i++){
        array[i] = sc.nextInt();
        
    }
    
    int max = array[0];
    int min = array[0];
    
    for(int i = 0; i < array.length; i++){
        if(array[i] > max){
            max = array[i];
        }
        if(array[i] < min){
            min = array[i];
        }
    }
    
    int span = max-min;
    System.out.println(span);
    
 }
}
