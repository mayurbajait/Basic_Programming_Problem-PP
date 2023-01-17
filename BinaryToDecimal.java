/*

Binary To Decimal
Given binary representation of number in the form of string, convert it to decimal representation.

Note : String will be given such that output will fit in int

Input Format
First line contains t number of test cases

Next t lines contain string s denoting binary representation

You need to complete binToDec function which contains binary string input s (binary representation) and print/return its decimal representation

Output Format
Print decimal representation of each string in different line

EXAMPLE 1
Input:

2
10
111
Output::

2
7
EXPLANATION:

10 is the binary representation of 2

111 is the binary representation of 7

*/

import java.io.*;
import java.util.*;

public class BinaryToDecimal {

	public static int binToDec(String s)
    {

		int sum = 0;
		
		for(int i = 0; i < s.length(); i++){
			int len = s.length()-i-1;
			sum = (s.charAt(len)-'0')*(int)Math.pow(2, i)+sum;
			
		}
		return sum;
    }
	
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            int ans = binToDec(s);
            System.out.println(ans);
            t -= 1;
        }   
    }
}
