import java.util.*;
class Solution{
	public static void sumOfDigits(int n){
		for(int i = 1; i <= n; i++){
			int num = i;
			int sum = 0;
			while(num > 0) {
				sum = sum + num % 10;
				num = num / 10;
			}
			System.out.println(sum);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution.sumOfDigits(n);
	}
}
