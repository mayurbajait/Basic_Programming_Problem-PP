import java.util.*;

class Accio {
    public void duplicates(int[] arr) {
        boolean flag = false;
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i]==arr[j]){
					flag = true;
				}
			}
		}
		if(flag == true){
			System.out.println(flag);	
		}
		else{
			System.out.println(flag);
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        Obj.duplicates(arr);
        sc.close();
    }
}
