import java.util.*;

public class AnyBaseToAnyBase {
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
    public static int getValueIndecimal(int n, int b){
      int rev = 0;
      int p = 1;
      while(n>0){
          int dig = n % 10;
          n/=10;
          rev = (dig*p)+rev;
          p = p*b;
      }
      return rev;
   }
   
    public static int getValue(int n, int b, int c){
      int dectoany = getValueIndecimal(n, b);
      int anydec = getValueInBase(dectoany, c);
      
      return anydec;
   }
   
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
    int  destBase = scn.nextInt();
    
    int ans = getValue(n, sourceBase, destBase);
    System.out.println(ans);
    

  }
}
