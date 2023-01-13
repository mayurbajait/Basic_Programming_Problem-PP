import java.util.*;
  
  public class DecimalToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter Decimal No : ");
      int n = scn.nextInt();
      System.out.print("Enter Base You Want Convert : ");
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println("You are converted Decimal number " + n +" into its corresponding value in base " + b + " is " + dn);
   }
  
   public static int getValueInBase(int n, int b){
       	int oct = 0;
        int pow = 1;
		
		while(n>0){
		    int dig = n%b;
		    oct = (dig*pow)+oct;
		    n/=b;
		    pow = pow*10;
		}
		return oct;
   }
  }
