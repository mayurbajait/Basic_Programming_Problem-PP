/*
Message printing 2
Write a Java program to print the given message.

Input Format

-line contains your name
-second line contains your age

Output Format

- Print the message
Expalnation

-if the input is Adarsh 20 then print 
My name is Adarsh. I am 20 years old
*/

import java.util.*;

public class MessagePrinting2 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String age = sc.next();
		System.out.println("My name is " + name + ". I am " + age + " years old");
    }
}
