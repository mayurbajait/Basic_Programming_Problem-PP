import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a= sc.nextInt();
        long b= sc.nextInt();
        
		long LHS = (a+b)*(a+b)*(a+b);
		long RHS = (a*a*a)+(b*b*b)+(3*a*a*b)+(3*a*b*b);

		System.out.println(LHS);
		System.out.println(RHS);

		if(LHS==RHS){
			System.out.println("VERIFIED");
		}
		else{
			System.out.println("NOT VERIFIED");
		}
    }
}
