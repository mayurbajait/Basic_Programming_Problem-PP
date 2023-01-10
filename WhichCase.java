/*
Which Case
You are required to take input of a character from the user. The task is to print the following

1, if the character is a uppercase alphabet(A to Z)

0, if the character is a lowercase alphabet(a to z)

-1, if the character is not an alphabet

Input Format
First line contains a character

Output Format
One line output of either 1 or 0 or -1 according to the conditions mentioned in the question

Example 1
Input

B
Output

1
Explanation

'B' is an uppercase alphabet.

Example 2
Input

i
Output

0
Explanation

'i' is a lowercase alphabet.

*/

import java.util.*;

public class WhichCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int result = WhichCase(ch);
        System.out.print(result);
		sc.close();
    }

	public static int WhichCase(char ch) {
		if(ch >= 'a' && ch <= 'z'){
            return 0;	
		}
		if(ch >= 'A' && ch <= 'Z'){
            return 1;
			
		}else{
			return -1;
		}
    }
}
