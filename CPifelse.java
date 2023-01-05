import java.util.*;
import java.lang.*;
import java.io.*;

public class CPifelse{
    static void check(int a){
        if(a<30){
			System.out.println("less important");
		}else{
			System.out.println("more important");
		}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
        int a;
        a=sc.nextInt();
        check(a);        
	}
}
