package Day7_2nd.Review.operator;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// 
		/*
		 *  Java Program that prints the day of the week. 
 Note :  Your input must be betweeWrin 1 to 7:
 Example:
Input   : 1
         output :  Monday

Input   : 7
         output :  Sunday


		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter weekday day number (1-7):");
		
		int weekday = scanner.nextInt();
		if(weekday == 1 ) {
			System.out.println("monday");
			
			
		} else if (weekday == 2){
			System.out.println("tuesday");
			
		} else if (weekday == 3) {
			System.out.println("wenseday");
			
		} else if(weekday ==4) {
			System.out.println("thursday");
			
		} else if(weekday ==5) {
			System.out.println("friday");
			
		} else if(weekday == 6) {
			
			System.out.println("saturday");
			
			
		} else if(weekday== 7) {
			System.out.println("sunday");
			
		} else {
			System.out.println("enter weekday number 1-7.");
			
		}
			
			
		
		
			

	}

}
