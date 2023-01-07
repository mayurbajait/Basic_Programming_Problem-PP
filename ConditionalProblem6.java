/* 
You are given two integers a and b. You need to perform the following operations

If both integers are odd, print `we are odd`.
Else print `we are simple`.
Input Format
First line contains two variables a and b.

Output Format
Output will be "we are odd" if both the variables are odd numbers. Otherwise output will be "we are simple".
*/  

import java.util.*;
public class ConditionalProblem6 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

		String ans =ConditionalProblem6(n,m);
		System.out.println(ans);
		sc.close();
    }
	static String ConditionalProblem6(int n, int m){

		if(m%2!=0 && n%2!=0){
			return "we are odd";
		}else{
			return "we are simple";
		}
    }
}
