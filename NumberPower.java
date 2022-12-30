import java.util.*;  
public class NumberPower{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the base: ");  
        int b = sc.nextInt();  
        System.out.print("Enter the exponent: ");  
        int e = sc.nextInt();  
        double power = Math.pow(b, e);    
        System.out.println(b +" to the power " +e + " is: "+power);  
    }  
}  
