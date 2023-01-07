/*
Fahrenheit to Celsius degree
Write a Java program to convert temperature from Fahrenheit to Celsius degree.

The Fahrenheit scale is a temperature scale based on one proposed in 1724 by physicist Daniel Gabriel Fahrenheit. It uses the degree Fahrenheit (symbol: °F) as the unit.

The Celsius scale, previously known as the centigrade scale, is a temperature scale used by the International System of Units (SI). As an SI derived unit, it is used by all countries in the world, except the U.S.

Input Format
Input a degree in Fahrenheit.

Output Format
Return temperature in Celsius degree.

Constraints
1 < = r < = 1000
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		double res = (f-32) * 5/9;
		System.out.println(res);
	}
}
