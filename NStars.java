import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i = 1; i <= n-1; i++){
			System.out.print("* ");
		}
		for(int i = 1; i <= n+1; i++){
			System.out.println("*");
		}
		        
    }
}
        
