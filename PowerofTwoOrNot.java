/*
Check whether the number is power of two or not.
Given an integer n, return true if it is a power of two. Otherwise, return false. An integer n is a power of two, if there exists an integer x such that n == 2x.

Input Format
A single integer

Output Format
Return true or false
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class PowerofTwoOrNot {
	static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPowerOfTwo(n));
	}
}
