package Day7_2nd.Review.operator;

public class Arithmetis_Java {

	public static void main(String[] args) {
		 // precedence of Arithmetic changes
		/*
		 * 1. ()
		 * 2. *, / %
		 * 3. +,-
		 * % modulas =
		 * 
		 */
//		int resullt = 5 % 2; // 5/2= 2+2+1 
		
	//	int result = 5 % 10;   // 5  first number come up?
	//	int result = 9 % (10 + 2)* 3;
//     dpuble result2 = 5.0 / 2.0;
		// System.out.println(result2); //   2.5
		
		// int result = 9 % 10;  // 9 
//     Precedence of Arithmetic	Operator;
		/* 1.
		 * 2. *,, / , %?
		 * 3. +, -
		 * 4. /
		 */
	//	System.out.println(9 % 19); //9
	//  System.out.println(4 % 16);//   4
	  
//		int result = 9 % 10 + 2 * 3; // 15
	//	              9 % 12 * 3 = 27
		int result = 9 % (10 + 2) * 3; // 15
		
		System.out.println(result); // 27
		
		
		
		
		
		
		

	}
	
	
	

}
