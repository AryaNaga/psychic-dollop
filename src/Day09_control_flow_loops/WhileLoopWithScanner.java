package Day09_control_flow_loops;

import java.util.Scanner;

public class WhileLoopWithScanner {

	public static void main(String[] args) {
		// T
		Scanner scanner = new Scanner(System.in);
	      String input = "";
	      while (!input.equals("quit")) {
	         input = scanner.next();
	         switch (input) {
	            case "buy":
	               System.out.println("Buy something");
	               break;
	            case "sell":
	               System.out.println("Selling things");
	               break;
	            case "quit":
	               break;
	            default:
	               System.out.println("Invalid command. Try again");
	         }
	      }
		
		
		
		
		
		
		

	}

}
