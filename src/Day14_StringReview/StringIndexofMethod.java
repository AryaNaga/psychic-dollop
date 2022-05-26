package Day14_StringReview;

public class StringIndexofMethod {

	public static void main(String[] args) {
	
	//                 0123456789 10    17
		String name = "President George Washington ";
		
		System.out.println(name.charAt(8));//  t
		
		System.out.println(name.charAt(9));//  
		System.out.println(name.charAt(10));// G
		System.out.println(name.charAt(17));// W
		
		System.out.println(name.indexOf('p'));// -1
		System.out.println(name.indexOf('P'));// 0
		

		System.out.println(name.indexOf('e'));// 2
		System.out.println(name.indexOf('e', 3));// 6
		System.out.println(name.indexOf('e', 9));// 11
		
		System.out.println(name.lastIndexOf('e'));//  15
		
		System.out.println(name.indexOf("George"));// 10
		
		System.out.println(name.indexOf("rge"));// 13
		System.out.println(name.indexOf("Bob"));// -1
		
		
		
		System.out.println(name.indexOf("George") > -1);// true
		
		
		System.out.println(name.indexOf("Bob" )>-1);// false
		
		
		
		
		
		
		
	}

}
