import java.util.*;

public class FactorialWithLoop {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        solve(n);
		input.close();
    }

	public static void solve(int n)
	{
		long sum = 1;
		for(long i = 1; i<=n; i++){
			sum = sum*i;
		}
		System.out.println(sum);
		
	}
}
