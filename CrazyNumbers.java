import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int count = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				System.out.print(count);
				count++;
				if(count == 10){
					count = 1;
				}
			}
			System.out.println();
		}
	}
}
