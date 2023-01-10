import java.io.*;
import java.util.*;

public class Quardants {
    static int quadrants(int x, int y)
    {
      
		if(x>0 && y >0){
			return 1;
		}
		else if(x<0 && y>0){
			return 2;
		}
		else if(x<0 && y<0){
			return 3;
		}
		else if(x>0 && y<0){
			return 4;
		}
		return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int result = quadrants(x, y);
        System.out.print(result);        
        System.out.println('\n');
    }
}
