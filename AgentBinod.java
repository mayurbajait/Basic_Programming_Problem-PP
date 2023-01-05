/*
You are required to take input a string agentName, and finally print the line "Hi my name is Agent insert agentName".

Input Format
First line contains a string which is the name of the agent.

Output Format
One line output of format "Hi my name is Agent insert agentName"
*/
import java.util.*;

public class AgentBinod {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        System.out.println("Hi my name is Agent " + a);
    }
}
