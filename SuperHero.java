import java.util.*;

public class Main {

	static String ModifyName(String name) {
        String n = " is a Super Hero";
		return name+n;
		
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(ModifyName(name));   
    }
}
