import java.util.*;

public class Main {
    static void zeroSubarray(int[] arr) {
        boolean flag = false;
		for(int i = 0; i < arr.length; i++){
			int sum = 0;
			for(int j = i; j < arr.length; j++){
				sum = sum + arr[j];
				if(sum == 0){
					flag = true;
					System.out.println("Subarray found from Index " + i + " to " + j);
				}
			}
		}
		if(flag == false){
				System.out.println(-1);
		}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        zeroSubarray(arr);
        sc.close();
    }
}
