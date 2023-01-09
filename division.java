/*
division
Write a Java program to divide the two numbers and print the convert the decimal value into integer and print it

Input Format

-line contain 1st number
-second line contains 2nd number
Output Format

- print the result

*/

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a/b;
		System.out.println(c);
			
    }
}
