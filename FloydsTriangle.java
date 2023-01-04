/* 
Floyds Triangle
Take input of N from the user and write a program to print the Floyd's Triangle pattern as follows:
For n=5,

Pattern is like,
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/

import java.util.*;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
		for(int i = 1; i<=n; i++){

			for(int j = 1; j<=i; j++){
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
    }
}

