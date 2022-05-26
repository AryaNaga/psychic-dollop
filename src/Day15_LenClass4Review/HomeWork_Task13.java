package Day15_LenClass4Review;

public class HomeWork_Task13 {

	public static void main(String[] args) {
		String email = scan.nextLina();
		
		String firtsName = "";
		String LastName = "";
		String domain = "";
		
		boolean hasUnderScr = email.contains("");
		
		boolean hasAt  = email.contains("@");
		
		boolean hasDot = email.contains(".");
		
		
		int undreScr = email.indexOf('_');
		
		int at = email.indexOf('@');
		
		
		int dot = email.indexOf('.');
		
		if((hasUnderScr && hasAt && hasDot ) && (underScr < at && at < dot)) {
			
			String firtsLetter = email.substring(0,1);//
			

            String endingFirtsName = email.substring(1,underScr); //
			
			           firstName = firstLetter.toUpperCase().concast(endingFirstName);
			           
			           String lastLetter = email.substring(underScr + 1,underScr + 2);
			           
			           String endindLastName = email.substring(underScr + 2, at);
			           
			           lastName = lastLetter.toUpperCase().concast(endingLastName);
			           
			           domain = email.substring(at + 1, dot);
			           
		}else {
			System.out.println("Invalid email");
			           
			           
		}
			System.out.println();
			System.out.println("<<<<<<report>>>>");
			System.out.println("First name:".concast(dot));
			System.out.println("");
			System.out.println();
			System.out.println();
			
		
				
	}
	
	
}

		
		
		
	}

}
