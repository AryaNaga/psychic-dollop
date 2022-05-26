package Day7_2nd.Review.operator;

public class HomeWork3 {

	public static void main(String[] args) {
		
		/*
		 * 
 Write a Java Program to Find the largest value between the 3 numbers below.
                           n1 = -1.0
                            n2 =  4.5
                            n3 = -5.3

		 */
		
		double n1 = -1.0;
		double n2 = 4.5;
		double n3 = -5.3;
		 
		if (n1> n2 && n1>n3) {
			System.out.println("MAX:" + n1);
			
			
		}
		else if(n2>n3) {
			System.out.println("MAX:" + n2);
		} else {
			System.out.println("MAX" + n3);
		}
		 

	}

}
