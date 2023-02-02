import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int d = sc.nextInt();

		if(n<x){
			System.out.print("NO");
		}else{
			if(d<=6){
				System.out.print("YES");
			}else if(6*n>=7*x){
				System.out.print("YES");
			}else{
				System.out.print("NO");
			}
		}
	}
}
