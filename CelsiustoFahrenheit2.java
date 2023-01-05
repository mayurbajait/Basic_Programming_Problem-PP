/*
Celsius to Fahrenheit 2
Given a temperature in Celsius, output the fahrenheit equivalent of it.

Note: Print complete answer up to 6 decimal places.

Input Format
Input consists of 1 line of a decimal number.

Output Format
Output consists of a single line of temperature in Fahrenheit.
*/

import java.util.*;

public class CelsiustoFahrenheit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
		double a = (1.8*C)+32;
		System.out.println(String.format("%.6f", a));
    
    }
}
