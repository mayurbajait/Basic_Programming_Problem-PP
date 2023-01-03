/*Write a program that takes a variable named input and 
assign its value and prints its multiplication table upto 10.
*/ 

import java.io.*;
import java.util.*;

public class Tables {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
		for(int i = 1; i <= 10; i++){
			System.out.println(x + " x " + i + " = " + i*x);
		}
    }
}
