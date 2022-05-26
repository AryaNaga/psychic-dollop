package Day15_LenClass4Review;

import java.util.Scanner;

public class BreakHomeWork {

	public static void main(String[] args) {
		
		// break
//		
//		for (int row= 0; row < 10; row++) {
//				System.out.println(row);
//				
//			//	for (int j = 0; j <=5; j++) {
//			//		System.out.print(j+"");
//					
//					
//				if (row == 5) break;// this will break out of the loop
//		}
//		while(true) {
//			// scanner take input from user
//			String input = 
//			if (input.equals("exit")) break;
//		}
//					
				
			// ask user to enter number between 1-100. if input not in range
		
//		Scanner sc = new Scanner(System.in);
//		int input;
//		while(true) {
//			
//			System.out.print("enter number between 1-100:");
//			input = sc.nextInt();
//			
//			if (input > 0 && input <= 100) break;
//			
//			System.out.println("number is not in 1-100 range");
//		}
//			System.out.println(input);
//			
	//	}
	
		 Scanner sc = new Scanner(System.in);
	      int input;
	      while (true) {
	         System.out.print("enter number between 1-100: ");
	         input = sc.nextInt();
	         if (input > 0 && input <= 100) break;
	         System.out.println("Number is not in 1-100 range");
	      }
	      System.out.println(input);
		
		
		
		
		
	}

}
