import java.util.*;
  
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		while(n%2==0){
			n = sc.nextInt();
			count++;
		}
		System.out.println(count);
	}
}
