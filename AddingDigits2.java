public class MyClass {
    public static void main(String args[]) {
      int n = 1223;
      int count = 0;
      for(int i = n; i>0; i++){
          int dig = n%10;
          count = count + dig;
          n = n/10;
      }

      System.out.println(count);
    }
}
