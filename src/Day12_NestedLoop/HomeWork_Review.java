package Day12_NestedLoop;

public class HomeWork_Review {

	public static void main(String[] args) {
		/*
		 * Write a method which prints out the numbers from 1 to 100 but for numbers which are divisible both 
3 and 5, print "FINRA" instead of the number,  for numbers which are divisible by 3, print "FIN" instead of the number
and for numbers which are divisible by 5, print "RA" instead of the number.
        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
`
		 * 
		 */
//		String msg ="";
//		
//		for(int i = 1; i < 101; i++) {
//			System.out.println(i);
//			
//			if(i % 3 == 0 3 == 0 & i % 5 ==0) {
//				System.out.println("FINRA");
//				msg = "FINRA";
//				
//			}else if(i % 3 ==0) {"FIN"};
//			
//				
//			}else if (i % 5 ==0) {System.out.println();"RA"};
//			
//			
//			System.out.println("i");
//				
//			
			
//		}
		
		
		
		///-------------------------
		/*
		 * Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120
                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
`

		 */
		int result = 0;
		for( int j = 5; j >=1 ; j--) {
			
			//  System.out.println(j);
			result = result * j;
		}
		
		
		System.out.println(result);
		
		
		
		
		
		
		
	}

}
