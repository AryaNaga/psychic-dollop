package HmeWorkLenn14;

import java.util.Scanner;

public class HomeWork_LenCoffee {

	public static void main(String[] args) {
		/* Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.

		 * 
		 */
		
		
	/*	Write how many cups of coffee you will need: 
		> 25
		For 25 cups of coffee you will need:
		5000 ml of water
		1250 ml of milk
		375 g of coffee beans
		```*/
		
		  
				  Scanner scan = new Scanner(System.in);
			
			System.out.println("Write how many cups of coffee you will need:");
			int cups = scan.nextInt();
			
			// to make 1 cup of coffee:
			int water = 200 * cups;
			int milk = 50 * cups;
			int coffeeBeans = 15 * cups;
			
			
			System.out.printf("For %d cups of coffee you will need:\n",cups);
			System.out.println(water+" ml of water");
			System.out.println(milk+" ml of milk");
			System.out.println(coffeeBeans+" g of coffee beans");
			
			
			scan.close();
		
	
		
		
		
		
		
		
		
	}

}
