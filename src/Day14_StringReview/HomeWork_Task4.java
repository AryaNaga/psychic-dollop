package Day14_StringReview;

public class HomeWork_Task4 {

	public static void main(String[] args) {
		
	/*
	 * write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
	 * */	
		
	String str = "TechCicrle";
	
	 char first = str.charAt(0);
     char last = str.charAt(str.length() - 1);
     if(first == last) {
	System.out.println("Same");// T Same
     }else {	
	System.out.println("Different");//  e different
     }
     
	}
	
}
		
		
		
		
		
