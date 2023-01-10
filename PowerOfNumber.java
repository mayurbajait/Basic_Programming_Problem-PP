import java.util.*;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        powerAtoB(a,b);
		sc.close();
    }

	static void powerAtoB(int base, int exponent)
    {
		int pow = 1;
        for(int i = 1; i<=exponent; i++){
			pow = pow*base;			
		}
		System.out.println(pow);
		
       
    }
}
