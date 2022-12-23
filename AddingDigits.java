import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int count = 0;
		while(n>0){
			int digit = n%10;
			count = count + digit;
			n = n/10;
		}
		System.out.println(count);
    }
}

