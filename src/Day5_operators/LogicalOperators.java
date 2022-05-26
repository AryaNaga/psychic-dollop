package Day5_operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// && , || , !
		
		// %% AND 
		/*
		 * ConditionA ConditionB Result
		 * true         true      true
		 * true         false      false
		 * false        true       false
		 * false        false       false
		 * 
		 */

		int a = 10;
		int b = 5;
		int c = 15;
		boolean conditionA = a+b == c;
		boolean conditionB = c-b == a;
		
		System.out.println(conditionA && conditionB);
		
		System.out.println((a+b == c) && (c-b == a));
		
		
		conditionA = c/b >= 3;
		conditionB = a+b > c;
		boolean result = conditionA && conditionB;
		System.out.println(result); // false
		
		
		
		String userName = "techcircle";
		String passworld = "abc123";
	System.out.println(userName=="techcircle" && passworld == "abc123");
		
		System.out.println(userName=="Hello" && passworld == "abc123");
		
System.out.println(userName=="techcircle" && passworld == "abc124");
		
		System.out.println(userName=="Hello" && passworld == "abc124");
		
		
		
		
		//  ||  OR
		
		/*
		 * ConditionA  ConditionB  Result 
		 *  true         true      true
		 * true         false      true
		 * false        true       true
		 * false        false       false
		 * 
		 
		 * 
		 */
		
		
		a = 1;
		b = 2;
		c = 3;
		//           1+2 ==3
		conditionA = a+b == c; // true
		
		
		conditionB = a-b >c;  // false
		System.out.println(conditionA || conditionB); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		
		System.out.println(false || true); // false
		System.out.println(false || false); // false
		
		System.out.println(conditionA || conditionB);
		
		System.out.println(conditionA || c/a==3);// true
		
		System.out.println(c+a > b+a ||  a<5); 
		
		
		System.out.println(c+a > b+a ||  a<5); // true
		
		
		// Logical not !
		/* ConditionA  ConditionB  Result 
		 *  ! true == false
		 *  !false == true 
		 */
		conditionA = true;
		conditionB = false;
		System.out.println(!conditionA);// false
		System.out.println(!conditionB);
		
		}

}
