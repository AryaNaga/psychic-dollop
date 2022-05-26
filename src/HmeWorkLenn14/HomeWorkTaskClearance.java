package HmeWorkLenn14;

import java.util.Scanner;

public class HomeWorkTaskClearance {

	public static void main(String[] args) {

/*  
 * 
Let's write program that check the user authorization before using the internal company software.
The program should ask the full name of the user and clearance level (1-4).

Denote the level of the clearance:

- `1` = junior employee
- `2` = senior employee
- `3` = manager
- `4` = admin
 */	

	




//				int cLevel = 1;
//				String name = "Naga";
//
//				switch (cLevel) {
//				case 1:
//					System.out.printf("Sorry, %s , the junior employee don't have access to this program", name);
//					break;
//				case 2:
//					System.out.printf("Sorry, %s , the Senior employee don't have access to this program", name);
//					break;
//				case 3:
//					System.out.printf("Sorry, %s , the Senior employee don't have access to this program", name);
//					break;
//				case 4:
//					System.out.printf("%s, you are admin. Welcome to the Program ABC", name);
//					break;
//				default:
//					System.out.println("Invalid");
//					
			//------------------------------
					
					Scanner scan = new Scanner(System.in);
					
					System.out.println("Please type you name:");
					String name = scan.nextLine();
					
					System.out.println("What is your clearance level?");
					int clearanceLevel = scan.nextInt();
					
					String role = "";
					
					if (clearanceLevel >= 1 && clearanceLevel <= 4) {
						
						if (clearanceLevel == 1) { 
							role = "junior employee";
							System.out.printf("Sorry, <%s>. The <%s> don't have access to this program.",name,role);
					
						}else if (clearanceLevel == 2) {
							role = "senior employee";
							System.out.printf("Sorry, <%s>. The <%s> don't have access to this program.",name,role);
							
						}else if (clearanceLevel == 3) {
							role = "manager";
							System.out.printf("<%s>, you are <%s>. Welcome to the program ABC.",name,role);
							
						}else {
							role = "admin";
							System.out.printf("<%s>, you are <%s>. Welcome to the program ABC.",name,role);
						}
						
					}
				
					scan.close();
					
					
					
					
					
					
					
					
					
					
				

				
	}
	
}
			

		






		
		
		
 
 
		
		
		
		
		
		
