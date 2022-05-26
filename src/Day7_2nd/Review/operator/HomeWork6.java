package Day7_2nd.Review.operator;

import java.util.Scanner;

public class HomeWork6 { 

	public static void main(String[] args) 

			 {
				// OddEvenNumber;
		
				Scanner Same = new Scanner(System.in);
				
				System.out.println("Enter your number, get your answer:");
				
				int number = Same.nextInt();
				
				if (number % 2 == 0) {
					System.out.println("This is an even number!");
				}
				if (number %2 == 1) {
					System.out.println("This is an odd number");
				}

			Same.close();
			
				
			}

		



	}


