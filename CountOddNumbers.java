import java.util.*;
  
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int count = 0;
		do{
			n = sc.nextInt();
			count++;
		}while(n%2==0);
		System.out.println(count);
	
	}
}
