/*
Given a number n.

Write a program to use switch case as follows

if the input number is 28, print i am young
else print i am not young
Complete the function conditionalProblem1

Input Format
first line contains an integer n

Output Format
print the statement based on value of n as given above
*/


import java.io.*;
import java.util.*;

public class CPSwitch {
    static void conditionalProblem1(int n)
    {
        switch(n){
			case 28 :
				System.out.println("i am young");
				break;
			default : 
				System.out.println("i am not young");
		} 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        conditionalProblem1(n);
    }
}
