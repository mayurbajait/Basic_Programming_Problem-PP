import java.util.*;
public class FactorialofNumber{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = 2;
		int res = 1;
		
		for(int i = 1; i <= n; i++){
		    res = i*res;
		}
		System.out.println(res);
	}
}
