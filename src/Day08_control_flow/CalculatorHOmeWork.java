package Day08_control_flow;

public class CalculatorHOmeWork {

	public static void main(String[] args) {
		
		double numA = 15;
		double numB = 5;
		
		String operator = "-";
	//	double total = numA + numB;
		double total = 0;
		
		if(operator == "+") {
			total = numA + numB;
		}
		
	if (operator == "-") {
		 
		total = numA - numB;
		
	}
	if (operator == "*") {
		 
		total = numA * numB;
		
	}
	if (operator == "/") {
		 
		total = numA / numB;
		
	}
	 
	System.out.println(total);
	// 15*5 = 75	
	//  System.out.println(numA + " " +operator);
	//  System.ot.println(numA + " " +operator + " ");	
//	System.out.println(numA + " " +operator +" " + numB);
//  System.out.println(numA + " " +operator +" " + numB +"=");	
	System.out.println(numA + " " +operator +" " + numB +" = " + total);
		
		
		
	}
	
}
		
		
		

