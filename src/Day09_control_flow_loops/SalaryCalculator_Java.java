package Day09_control_flow_loops;

public class SalaryCalculator_Java {

	public static void main(String[] args) {
		
		int hourlyRate = 50 , WeeklyHours = 45 , stateTaxRate = 6;
		int federalTaxRate = 26;
		
		int SalaryBeforeTax = hourlyRate * WeeklyHours *52;
		int stateTax = SalaryBeforeTax * stateTaxRate / 100;
		int federalTax =  SalaryBeforeTax * federalTaxRate /100;
		int totalTax = stateTax + federalTax ;
		int netincome = SalaryBeforeTax - federalTax - stateTax ;
		
		
		
		
		System.out.println( " gross pay is $" + SalaryBeforeTax);
		System.out.println("FederalTax is $" + federalTax);
		System.out.println(" StateTax is $" + stateTax);
		System.out.println("TotalTax is $" + totalTax);
		
		System.out.println("Net income is $" + netincome);
		
		
		
		
		
		
		
		
		
		

	}

}
