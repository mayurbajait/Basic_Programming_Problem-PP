import java.util.*;
public class Main {

    public static void solve(int []arr, int n){
        int k = 4;
		int c = 0;
		for(int i = 0; i <= n-k; i++){
			boolean flag = true;
			for(int j = i + 1; j <= i+k-1; j++){
				if(arr[j - 1] >= arr[j]){
					flag = false;
					break;
				}
			}
			if(flag == true){
				c++;
			}
		}
		if(c == 0){
			System.out.println(0);
		}
		else{
			System.out.println(c);
		}
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        solve(arr, n);
    }
}
