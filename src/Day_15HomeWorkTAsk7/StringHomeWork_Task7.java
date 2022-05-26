package Day_15HomeWorkTAsk7;

import java.util.Scanner;

public class StringHomeWork_Task7 {

	public static void main(String[] args) {
		
	/*
	 *
## Task7
`
 Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
	 * */
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String str = scan.nextLine();
		
		String report = "";
		
		if(str.length() ==0) {
			report = "String is empty";
			
		}else if (str.length()>3) { 
			report = str.substring(str.length() - 3);
		}else {
			report = str;
			
		}
		  System.out.println(report);
		
		
		scan.close();
		
		
		
		
	}

}
