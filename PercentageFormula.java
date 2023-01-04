/*Round up the result of integer division
Write a Java program to round up the result of integer division.
Note : Percentage formula = ((Marks 1 + Marks 2 )× 100)/Total Marks.

Input Format
Three integer value representing marks 1, marks 2 and total marks

Output Format
Return an integer value representing calculated percentage.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class PercentageFormula{
	public static void main (String[] args)	{
		Scanner sc= new Scanner(System.in);

		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int tm = sc.nextInt();
		
		int mg = m1+m2;
		int res = (mg*100)/tm;
		
		System.out.println(res+"%");
	}
}
