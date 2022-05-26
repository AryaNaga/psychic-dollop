package Day14_StringReview;

public class StringTrimMethod {

	public static void main(String[] args) {
		
		String str1 = "        Hello   ";
		
		System.out.println(str1.length());// 16
		
		System.out.println(str1);// Hello
		
		str1 = str1.trim();
		
		System.out.println(str1.length());// 5
		
		System.out.println(str1);// Hello
		
		
		
		
		
		
		String str2 = "              Hello                    ";
		
		System.out.println(str1.length());// 44
		
		System.out.println(str2);// 
		
		str2 = str2.trim();
		System.out.println(str2);// 
		
		
		
		
		
		//----------------
		String name = "President George Washington";
		
		System.out.println(name.length());// 27
		
		name = name.trim();
		
		System.out.println(name.length());// 27
		
		
		
		
		
		
		
		
		
		
	}

}
