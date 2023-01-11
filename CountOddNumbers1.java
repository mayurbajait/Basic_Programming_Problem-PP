/*
Odd Numbers
You have to keep taking integers as input until you get an odd number as input. Your output will be N, which represents the number of numbers you had to take as input uptill encountering an odd number.

Input Format
You will be given N-1 even numbers followed by an odd number.

Output Format
For each test case print the value of N in a new line.

Example 1
Input

4
8
6
10
12
13
Output

6

*/
import java.util.*;
  
class CountOddNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(;;){
			int n = sc.nextInt();
			count++;
			if(n%2!=0){
				break;
			}
		}
		System.out.println(count);
	}
}
