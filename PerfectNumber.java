import java.util.*;
public class PerfectNumber{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i < n; i++){
		    if(n % i == 0){
		        sum = sum + i;
		    }
		} 
		
		if(sum == n){
		    System.out.println(n + " is a perfect number");
		}else{
		    System.out.println(n + " is not a perfect number");
		}
	}
}
