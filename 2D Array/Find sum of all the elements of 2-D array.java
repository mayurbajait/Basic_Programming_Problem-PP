import java.util.*;

class Main{
    static int findSum(int[][] arr, int n, int m) {
        int sum = 0;
		for(int i=0;i<n;i++){
            int sums = 0;
			for(int j=0;j<m;j++){
                sums = sums + arr[i][j];
            }
			sum = sum + sums;
	    }
		return sum;
	}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]A=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int ans=findSum(A, n, m);
        System.out.println(ans);
        sc.close();
    }
}
