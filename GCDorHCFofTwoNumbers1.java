import java.util.*;
public class GCDorHCFofTwoNumbers1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
		int min = Math.min(num1, num2);
        while(min!=0){
			if(num2%min==0 && num2%min==0){
				System.out.println(min);
				return;
			}
			min--;
		}
    }
}
