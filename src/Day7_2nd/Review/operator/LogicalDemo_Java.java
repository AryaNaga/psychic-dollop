package Day7_2nd.Review.operator;

public class LogicalDemo_Java {

	public static void main(String[] args) {
		 
		/*
		 * logical operator = Boolean expression
		 * result always true or false
		 * 
		 * 
		 *
		
		boolean isTall = true;
		System.out.println(!isTall);
		  
		
		// AND - && => Binary Operator
		// all of operands 'need to be true'  
		// OR - ||;
		// At least one of operand is 'true' , then result == 'true';
		/*boolean b1 = false && false; // false
		boolean b2 = false && true; // false
		boolean b3 = false && false; // false
		boolean b14 = false && true; // false
		System.out.println(false && true && 10 > 3 && true);
		
		
		/*System.out.println(false && true && 10 > 3 && true);
		
		boolean isHandsome = true;
		boolean isRich = true;
		boolean isMyType = isHandsome && isRich;
		System.out.println(isMyType);*/
		
		/*boolean b1 = false || false; // false
		boolean b2 = false || true; // false
		boolean b3 = false || false; // false
		boolean b14 = false ||  true; // false
		System.out.println(true || false || false || true);*/
		
		
		
		// Precedence of logical opreator
		/*
		 * 1. ();
		 * 2. !
		 * 3 && , ||
		 */
		 
		 //     true && true =>
		
		boolean b = false && !false;
		// false
		System.out.println(b);
		
		
		System.out.println(false && true && 10 > 3 && true);
		
		
		

	}

}
