/*Write a Java program to convert a given string into lowercase.

Lowercase is a typeface of small characters. For example, a, b, and c is lowercase and A, B, and C is uppercase */

import java.util.*;
import java.lang.*;
import java.io.*;

public class ConvertStringLowercase {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		System.out.println(s.toLowerCase());
	}
}
