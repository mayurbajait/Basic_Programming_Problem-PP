//for loop will runs n/2 times
import java.util.*;
public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
		long count = 0;
		for(long i = 1; i <= n; i = i + 2){
		    count = i+count;

		}
		System.out.println(count);
    }
}

//for loop will runs n times
import java.util.*;
public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
		long count = 0;
		for(long i = 1; i <= n; i++){
			if(i % 2 != 0){
				count= count+i;
			}
		}
        System.out.println(count);
    }
}
