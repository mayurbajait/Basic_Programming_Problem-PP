import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
		long sum = 0;
		for(long i = 1; i<=N; i++){
			sum+=i;
		}		
		System.out.println(sum);
    }
}
