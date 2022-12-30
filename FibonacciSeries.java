import java.util.*;  
public class FibonacciSeries{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        int a = 0; 
        int b = 1;
        int nextTerm;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++){
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " ");
        }
    }  
}
