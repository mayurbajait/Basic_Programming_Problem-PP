/*Declare 3 variable v1, v2, v3 of type float and initialize the values as
10.5, 12.5 and 12.15 respectively. Then declare another variable average of 
type float that will store the average of these variables i.e. average = (v1+v2+v3)/3 
and print the floored integer value.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class CalculateAverage{
	public static void main (String[] args) throws java.lang.Exception{
		float v1 = 10.5f;
		float v2 = 12.5f;
		float v3 = 12.15f;
		float average = (v1+v2+v3)/3;

		int res = (int) average;

		System.out.println(res);
	}
}
