import java.util.*;

class Solution{
     
    public static void countPal(int min, int max)
    {
                for(int i = min; i <= max; i++){
					int rev = 0;
					int pal = i;
					while(pal>0){
						int dig = pal%10;
						rev = (rev*10)+dig;
						pal/=10;
					}
					if(rev == i){
						System.out.print(rev + " ");
					}
				}
    }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();   
        Solution Obj = new Solution();
        Obj.countPal(start, end);
    }
}
