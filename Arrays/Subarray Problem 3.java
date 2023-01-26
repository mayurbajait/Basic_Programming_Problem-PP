import java.util.*;

public class Main {
    public static int largestAltitude(int[] gain) {
        int sum = 0;
		int max = 0;
		for(int i = 0; i < gain.length; i++){
			sum = sum + gain[i];
			max = Math.max(max, sum);
		}
		return max;
    }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int gain[]=new int[n];
        for(int i=0;i<n;++i){
            gain[i]=sc.nextInt();
        }
        int maxaltitude=largestAltitude(gain);
        System.out.println(maxaltitude);
    }
}
