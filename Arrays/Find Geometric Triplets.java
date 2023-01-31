import java.util.*;

public class Main {
    
    public static void findGeometricTriplets(int arr[], int n) {
        for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(arr[j] % arr[i] == 0){
					int ratio1 = arr[j]/arr[i];
					for(int k = j + 1; k < n; k++){
						if(arr[k] % arr[j] == 0){
							int ratio2 = arr[k] /arr[j];
							if(ratio1 == ratio2){
								System.out.println(arr[i] +" "+ arr[j]+" "+arr[k]);
							}
						}
					}
				}
			}
		}
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        findGeometricTriplets(arr, N);
        sc.close();
    }
}
