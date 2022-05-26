package Day08_control_flow;

import java.util.Scanner;

public class CalculatorWithScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number A");
		double numA = scan.nextDouble();
		System.out.println("Enter Number B");
		double numB = scan.nextDouble();
		
		System.out.println("Type one of the following operators");
		
		System.out.println(" + , -, * , /");
		String operator = scan.next();
		
		double total = 0;
		

		
	//	String operator = "-";
		//	double total = numA + numB;
		
		
		if (operator.equals("+")){
			total = numA + numB;
		}
		
		if (operator.equals( "-")) {
			
			total = numA - numB;
			
		}
		if (operator.equals("*")) {
			
			total = numA * numB;
			
		}
		if (operator.equals("/")) {
			
			total = numA / numB;
			
		}
		
		
		// 15*5 = 75	
		//  System.out.println(numA + " " +operator);
		//  System.ot.println(numA + " " +operator + " ");	
//	System.out.println(numA + " " +operator +" " + numB);
//  System.out.println(numA + " " +operator +" " + numB +"=");	
		System.out.println(numA + " " +operator + " " + numB +" = " + total);
		
		scan.close();
		
		
		
		
		
		
		
	}
	
}
		
		
		
		
