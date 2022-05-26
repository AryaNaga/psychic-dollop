package Day_15HomeWorkTAsk7;

import java.util.Scanner;

public class StringHomeWork_8 {

	public static void main(String[] args) {
		
		/*
		 * `
## Task8
`
write a program that asks the user enter a three letter word. Check if the middle
character of the given word is 'a'. In the case it is print: "Cool word", but in the case
the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter three letter word");
		
		String word = scan.nextLine();
		
		
	//	String response = "";
		
		if(word.length()< 3) {
			//response = "Word is too short";
			System.out.println("too short");
		}else if (word.length() > 3 ) {
			//response = "Word is too long";
			System.out.println("too long");
		}else {
			
			if (word.charAt(1) == 'a' && word.length() == 3 ) {
				
				System.out.println("cool word");
					//response = "Cool word";
					// dads
			}
			else {
				//response = "Okay word";
				
				System.out.println("Okay word");
			//System.out.println(response);
			}
				
				scan.close();
			
		}
		
		
	}
	
}
		
		
		
		
		
		
