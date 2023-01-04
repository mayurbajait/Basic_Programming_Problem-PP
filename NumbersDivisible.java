/*
Print Numbers Divisible By 3,5 And By Both
Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.

Input Format
An integer value.

Output Format
Return all the integer values between 1 to 100 which are divisible by 3, 5 and by both.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class NumbersDivisible{
	public static void main (String[] args){
		int n = 100;
		System.out.println("Divided by 3:");
		for(int i = 1; i<n; i++){
			if(i%3==0){
				System.out.print(i+", ");
			}
		}
		System.out.println();
        System.out.println();

		System.out.println("Divided by 5:");
		for(int i = 1; i<n; i++){
			if(i%5==0){
				System.out.print(i+", ");
			}
		}
        System.out.println();
        System.out.println();

		System.out.println("Divided by 3 & 5:");
		for(int i = 1; i<n; i++){
			if(i%3==0 && i%5==0){
				System.out.print(i+", ");
			}
		}
	}
}
