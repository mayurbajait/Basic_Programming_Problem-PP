import java.io.*;
import java.util.*;


public class LargestElementArray {
    public static void SecondLargest(int[] arr, int n) {
		int fmx = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > fmx){
				fmx = arr[i];
			}
		}
		System.out.println(fmx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
}
