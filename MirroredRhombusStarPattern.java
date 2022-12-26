//First Approch

import java.util.*;

public class MirroredRhombusStarPattern{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
		    for(int j = 1; j <= n-i; j++){
		        System.out.print(" ");
		    }
		    for(int k = 1; k <= n; k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}

//Second Approch 

import java.util.Scanner;
public class MirroredRhombusStarPattern{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		for(int i=0;i<rows;i++)      
		   {
		      for(int j=rows;j>i;j--){
		          System.out.print(" "); 
          }
		      for(int j=0;j<rows;j++){
		           System.out.print("*"); 
          }
		      System.out.println(); 
	   }
	}
}
