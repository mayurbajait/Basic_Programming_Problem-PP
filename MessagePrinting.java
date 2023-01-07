/*
Message printing
Write a Java program to print the given message.

Input Format

-line contains your name

Output Format

- Print the message

*/

import java.util.*;

public class MessagePrinting {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		System.out.println("My name is " + n + ". I like to code.");
    }
}
