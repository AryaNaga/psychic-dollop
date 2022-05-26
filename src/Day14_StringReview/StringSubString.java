package Day14_StringReview;

public class StringSubString {

	public static void main(String[] args) {
	//         0123456789	
String str1 = "Television";
  
     System.out.println(str1.substring(4));// vision
     
     
     System.out.println(str1.substring(2, 5));// lev
     //           012345678
   String str2 = "immutable";
    
		
     System.out.println(str2.substring(2));// mutable
     
     
     
		
     System.out.println(str2.substring(4));//  table
     
     
    
     
		
     System.out.println(str2.substring(4, 9)); // table
     
     
     String email = "firstName.lastName@domainName.com";
     //               0123456789       17   22
      String gmail = "Irfan.techCicrle@gmail.com";
      
      System.out.println(gmail.indexOf('g'));// 17
      
      System.out.println(gmail.lastIndexOf('.'));// 22
      
      String domainName = gmail.substring(17, 22);
      
      System.out.println(domainName);// gmail;
      
      System.out.println(gmail.substring(gmail.indexOf('g'), gmail.lastIndexOf('.')));
      
      // gmail;
      
      // gmail;    
      
      
      
      
      
     
     
     
		
		
		
		
	}

}
