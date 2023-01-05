/*
Input / Output in Java
In this challenge, you will learn to read input for the first time. The most popular way to read input in java is by using Scanner.

For example:

Scanner scanner = new Scanner(System.in);
int myInt = scanner.nextInt();
For printing it

System.out.println("myInt is: " myInt);
The code above creates a Scanner object named scanner and uses it to read an integer. It prints output using System.out.println(MyInt). So, if our input is: 5
Our code will print: myInt is: 5
In this challenge, you must read 3 integers and then print them. Each integer must be printed on a new line.
*/
import java.io.*;
import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
    }
}
