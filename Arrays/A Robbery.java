import java.util.*;

class Solution {
    public int maxAmount(int[] a) {
        int dp [] = new int [a.length];
		dp[0] = a[0];
		dp[1] = Math.max(a[0], a[1]);

		for(int i = 2; i < a.length; i++){
			dp[i] = Math.max(dp[i-1], a[i]+dp[i-2]);
		}
		return dp[a.length-1];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxAmount(a));
        sc.close();
    }
}
