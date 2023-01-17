import java.io.*;
import java.util.*;

public class Main {

	public static int binToDec(String s)
    {

		int sum = 0;
		int len = s.length()-1;
		sum = (s.charAt(len)-'A');	
		
		return sum;

		// for(int i = 0; i < s.length(); i++){
		// 	int len = s.length()-i-1;
		// 	sum = (s.charAt(len)-'0')*(int)Math.pow(2, i)+sum;	
		// }
		// return sum;
		
    //     int decimal = 0;  
	   //  int n = 0;  
	   //  while(true){  
	   //    if(binary == 0){  
	   //      break;  
	   //    }
		  // else {  
	   //        int temp = binary%10;  
	   //        decimal += temp*Math.pow(2, n);  
	   //        binary = binary/10;  
	   //        n++;  
		  //  }  
	   //  }  
	   //  return decimal; 
    }
	
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            int ans = binToDec(s);
            System.out.println(ans);
            t -= 1;
        }   
    }
}
