package Day14_StringReview;

public class StringReplaceMethod {

	public static void main(String[] args) {
		
		String word = "car";
		
		 word = word.replace('r' ,'t');
		 System.out.println(word);// cat
		
		String str = "tomato";
		System.out.println(str);
		
		str = str.replace('t', 'p');
		
		System.out.println(str);// pomapo 
		
		String str2 = "tomato";
		
		System.out.println(str);// pomapo
		
		str2 = str2.replace("to", "MO");// 
		
		System.out.println(str2);// MOmaMO
		
		//   ----------
		
		String str3 = "How Turkey spoiled Nato historic moment with Finland";
		
		str3 = str3.replace("Turkey","India ");
		
		System.out.println(str3);
		
		str3 = str3.replace(" ", "");//  <-----
		System.out.println(str3);// no space
		
		
		
	}

}
