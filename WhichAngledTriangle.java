import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c, maxx;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

		maxx = Math.max(a, Math.max(b, c));

		int LHS = 2*maxx*maxx;
		int RHS = (a*a) + (b*b) + (c*c);

		if(LHS<RHS){
			System.out.println(1);
		}
		else if(LHS==RHS){
			System.out.println(2);
		}
		else{
			System.out.println(3);
		}
	}
}
