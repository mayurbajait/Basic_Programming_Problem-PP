import java.util.*;
public class PerfectSquare{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = sc.nextInt();
		double root = (int)Math.sqrt(i);

		if((root*root)==i){
		    System.out.println(i + " is a perfect number");
		}
	    else{
	        System.out.println(i + " is not a perfect number");
	    }
	}
}
