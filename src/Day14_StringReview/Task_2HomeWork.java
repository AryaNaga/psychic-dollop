package Day14_StringReview;

public class Task_2HomeWork {

	public static void main(String[] args) {
	/*	
		Create a class called Reverse, write a program that will reverse a string.
	    Your program should reverse a string only 5 characters long.
	    If word is shorter, display message: "Too short!".
	    If word is longer, display message: "Too long!".
	    Otherwise, reverse this word and print out result into the console.
		
		*/
		
//String a = "loops";
//        
//        if (a.length() > 5) {
//            System.out.println("Too Long");
//            
//        }else if (a.length() < 5) {
//            System.out.println("Too Short");
//            
//        }else {
//        
//        System.out.println(a.replace("loops", "spool"));} //
//      //-----------------------------
        
        
//        
//		//-----------------
//        String input1 = " Hello  world";
//        if(input1.length()<5) {
//            System.out.println("too long");
//        }else if (input1.length()>5) {
//            System.out.println("too short");
//        }
//        
		
		String str = "pizza";
		
		if (str.length()== 5) {
			// reverse your string
//			System.out.println(str.charAt(4));
//		System.out.println(str.charAt(3));
//			System.out.println(str.charAt(2));
//			System.out.println(str.charAt(1));
//			System.out.println(str.charAt(0));
			//			System.out.println();
			
			for (int i = str.length()-1; i >= 0; i--) {
		//	for(int i = 4; i >=0;i--) {
	//			System.out.println(i);
			
				System.out.print(str.charAt(i));
			
			}
		}else if (str.length()> 5) {
			System.out.println("too long");
			
		}else {
			System.out.println("too short");
			
			
			
		}
		
	//--------------------------------
		
		/* write a program that asks user to enter two strings, and print out the longest string*/
			
		
//String str= "pizza pasport";
		
//	//	if (str.length()== 12) {
			// reverse your string
//			System.out.println(str.charAt(4));
//			System.out.println(str.charAt(3));
//			System.out.println(str.charAt(2));
//			System.out.println(str.charAt(1));
//			System.out.println(str.charAt(0));
			
	//		for(int i = 4; i >=0;i--) {
	//			System.out.println(str1.charAt(i));
				
			
	// Task 3 ------
		//--write a program that asks user to enter two strings , and print out the longest string.		
			
	
			  
	        String str1 = "TechCircle";
	        String str2 = "SchoolSchool";
	        
	        
	        if (str1.length() > str2.length()) {
	            System.out.println(str1);
	        }else {
	            System.out.println(str2);//   schoolschool
	        }
	}
		
		
		
	}
	


