import java.util.*;

class Solution {
	public int factor(int x){
		int fact = 1;
		for(int i = 1; i <= x; i++){
			fact = fact*i;
		}
		return fact;
	}
    public int func(int a, int b) {
        int p = factor(a);
		int q = factor(b);
		
		int min = Math.min(p, q);

		return min;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        input.close();
        System.out.println(new Solution().func(a, b));
    }
}
