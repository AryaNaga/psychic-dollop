package Day7_2nd.Review.operator;

public class HomeWork_G {

	public static void main(String[] args) {
		//  Weird number
		
	/*int 'n'
	 * 
	 * 
	 *
	 * 
	 * 
	 * 
	 * 
	 * 	1 <= n <= 100;
	 */
		int n = 99;
		// if n is odd;
		
		if ( n % 2 != 0)    // is n odd;
			System.out.println("Weird");
		
		// if n is even and the inclusive range of 2 to 5 , print Not Weird
		// 2 3 4 5
//		if (n >= 2 && n <= 5); // inclusive range of 2 to 5
//		System.out.println("Not Weird");
//			
//		
//		
//			else if ( n >= 6 && n<= 20 );
//			System.out.println("Weird");
//			
//		
//			else
//		 //                    {
//			System.out.println("Not Weird");
//			
		
		
		
	// ---------------
	  int j = 44;

      if (n % 2 != 0) { // if n is odd
         System.out.println("Weird");
      } else { // if n is even
         if (n >= 2 && n <= 5)  // inclusive range of 2 to 5
            System.out.println("Not Weird");
         else if (n <= 20)  // inclusive range of 6 to 20
            System.out.println("Weird");
         else  // greater than 20
            System.out.println("Not Weird");
      }
      
      // 20
      // 2 3 4 5                 true      false
//      if (n >= 2 && n <= 5) // n <= 5 != n >= 6 // opposite
//      // 6 7 ... 20
//      else if (n <= 20)
//      // 21 22 ... 100
//      else // greater 20
		
		
		
		
		
		

	}

}
