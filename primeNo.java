import java.util.*;
public class primeNo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime = true;

		for(int i = 2; i < n; i++){
			if(i % n == 0){
				prime = false;
				break;
			}
		}
		System.out.println(prime);
	}
}
