package Day15_LenClass4Review;

public class homeWork_Task7multipacationTable {

	public static void main(String[] args) {
	//	Write Code to Print these two shape:

			/******
			*****
			*****
			*****
			*****


			    *****
			   *****
			  *****
			 *****
			*****
			AimingZhang — Today at 12:14 PM*/
//			
//			for (int row = 1; row <= 5; row++) {
//			            
//			            for (int column = 1; column <= 5; column++) {
//			                System.out.print("*");
//			                
//			            }
//			            System.out.println();
//			            
//			        }
//		
		
			for (int row = 1; row <= 5; row++) {
	            
	            for (int column = 1; column <= 5; column++) {
	                System.out.print("*");
	                
	            }
	            System.out.println();
	            
		
			}
		//         ------------------------
			
			
			
			/*
		       ----*****  4
		       ---*****   3
		       --*****    2
		       -*****     1
		       *****      0
		       */

		      char star = '*';
		      char space = ' ';
		      int n = 5;

		      for (int i = 0; i < n; i++) { // run 5 times
		         // space loop                 
		         for (int j = i; j < n-1; j++) {
		            System.out.print(space);
		         }

		         // star loop
		         for (int j = 0; j < n; j++) { // run 5 times
		            System.out.print(star); // print 5 stars
		         }

		         System.out.println();
		      }
			
		
	}

}
