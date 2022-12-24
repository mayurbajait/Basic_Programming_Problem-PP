import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bcn = n;
		    int add = 0;

		    while(n>0){
			    int dig = n%10;
			    add = add + (dig*dig*dig);
			    n /= 10;
		    }
		    if(add==bcn){
			    System.out.println(1);
		    }else{
			    System.out.println(0);
		    }
    }
}
