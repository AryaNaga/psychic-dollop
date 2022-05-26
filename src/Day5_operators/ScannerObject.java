package Day5_operators;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		// Create instance of scanner object;
		

	
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please type number A");
		// int a = 20;
		int a = s.nextInt();
		System.out.println("Please type number B");
		int b = s.nextInt();
		int result = a+ b;
		System.out.println(result);
		
		System.out.println("What your name/");
		
		String name = s.nextLine();
		
		System.out.println("Hello "+name);
		s.close();
		
		
		   Scanner irfan = new Scanner(System.in);
	        
	        System.out.println("Please type value a");
	        //int a = 1;
	        int a1 = irfan.nextInt();
	        
	        
	        System.out.println("Please type value b");
//	        int b = 2; 
	        int b1 = irfan.nextInt(); 
	        
	        
	        
	        System.out.println("Please type value c");
//	        int c = 3;
	        int c1 = irfan.nextInt();
	        
	        System.out.println(a1+b1 > c1);
	        

	        irfan.close();
		
		
		//     name;
		
System.out.println("What's your name?");
        
        String name1 = s.nextLine();
        
        System.out.println("Hello "+name1);
        
        
        s.close();
        
        
        
        
		
		
		
		
		
		
	
		
		
	

	}

}
