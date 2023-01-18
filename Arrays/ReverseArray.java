import java.io.*;
import java.util.*;


public class ReverseArray {

    public static void reverseArray(int arr[], int start, int end)
    {
		
		int n = arr.length;
		int temp = 0;
		
        for(int i = start; i < n/2; i++){
			temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        
        reverseArray(arr1, 0, n-1);
        
        for (int i = 0; i < n; i++)
             System.out.print(arr1[i] + " ");       
        System.out.println('\n');
    }
}
