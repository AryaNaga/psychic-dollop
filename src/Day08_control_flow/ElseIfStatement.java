package Day08_control_flow;

import java.util.Scanner;

public class ElseIfStatement {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		int numb = 2;
		 String age1 ="infancy";
		 String age2 ="Todler";
		 String age3 ="early school age";
		 String age4 ="middle school age";
		 String age5 ="early adolescennce";
		 String age6 ="later adolscence";
		 String age7 ="infancy";
		 String age8 ="infancy";
		 String age9 ="infancy";
		 
		 if (numb <= 1 && numb >=2) {
			 System.out.println(age1);
			 
		 }
		 else if (numb <= 2 && numb >= 4) {
			 System.out.println(age2);
		 }
			 
			 else if (numb <= 4 && numb >=6) {
				 System.out.println(age1);
				 
			 }
			 else if (numb <= 8 && numb >= 10) {
				 System.out.println(age2);
				 
				 
	}    else if (numb > 6 && numb <= 8) {
		System.out.println("Midle  school age");
		
	} else {
		System.out.println("invalide age");
		
		
	
		
	}
		 
		 
	}
	
}
		
		
		
		
		
		
		
		
		
		
		

