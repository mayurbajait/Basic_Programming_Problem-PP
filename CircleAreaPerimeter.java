/*
Circle Area-Perimeter
You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.

Take pi as 3

Input Format
One line contains a number which is the radius of a circle.

Output Format
Print the area of the circle in the first line

Print the perimeter of the circle in the second line

*/

import java.util.*;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pi = 3;
		int r = sc.nextInt();

		System.out.println(pi * r * r);
		System.out.println(2 * pi * r);
	
    }
}
