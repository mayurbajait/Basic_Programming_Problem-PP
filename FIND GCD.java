import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long ans = findGCD(a, b);
        System.out.println(ans);
    }

	static long findGCD(int a, int b){

		long gcd = 0;
		for(int i = 1; i <= a; i++){
			if(a%i==0 && b%i==0){
				gcd = i;
			}
		}
		return gcd;
		
    }
}
