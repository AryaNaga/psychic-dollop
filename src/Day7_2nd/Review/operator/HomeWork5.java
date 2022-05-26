package Day7_2nd.Review.operator;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
       * Write a Java Program to print the following message. 
        
Good Morning  
5< 12 
Good Afternoon
12 — 17
Good Evening
17—24
*/

// When do the greetings (Good morning, afternoon, and evening) change?
// Good Morning. 5:00 AM — 11:59 AM.
// 
		// Good Afternoon. 12:00 PM — 4:59 PM.
// Good Evening. 5:00 PM — 4:59 AM. 
		 
		int time = 7;
		if (time >=5 && time <=12) {
			 
			System.out.println("Good morning");
		}
		else if (time >=12 && time <=17) {
			System.out.println("Good Afternoon");
			
		}
		else if(time >=17 && time <=24 ){
			
			System.out.println("Good Evening");
			
			
		} else {
				System.out.println("Go to sleep !!");
			}
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

