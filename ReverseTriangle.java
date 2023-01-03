/*
In this problem we will be coding a Java Program for triangle star pattern
which will have n number of stars in it rows and m number of stars in column
hence it will be a n x m triangle star pattern. Pattern programming is a
basic technique of programming which is followed by young programmers in order
to master loops and learn their working.
  
****
***
**
*

*/

import java.util.*;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; ++i) {
			for(int j = i; j<=n; ++j){
				System.out.print("*");
			}
			System.out.println();
        }
    }
}
