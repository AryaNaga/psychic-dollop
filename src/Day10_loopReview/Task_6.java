package Day10_loopReview;

public class Task_6 {

	public static void main(String[] args) {
		/*
		  String str = "chrome";
	        
	        switch(str) { 
	        case "chrome":
	        case "firefox":
	        case "opera":
	        case "safari":
	        case "edge":
	        case "ie":
	          System.out.println(str + " browser is selected");
	}   break;
	
	     default:
	                System.out.println("Invalid browser is selected");
	              
	                
	                */
		String browser = "CHROME";

        if (browser == "CHROME") {
            System.out.println("CHROME BROWSER IS SELECTED");

        } else if (browser == "FIREFOX") {

            System.out.println("FIREFOX BROWSER IS SELECTED");
        } else if (browser == "OPERA") {

            System.out.println("OPERA BROWSER IS SELECTED");
        } else if (browser == "SAFARI") {

            System.out.println("SAFARI BROWSER IS SELECTED");
        } else if (browser == "EDGE") {

            System.out.println("EDGE BROWSER IS SELECTED");
        } else if (browser == "IE") {

            System.out.println("IE BROWSER IS SELECTED");

        } else {
            System.out.println("INVALID BROWSER");
        }

        switch (browser) {
        case "CHROME":
            System.out.println("Chrome browser selected");
            break;
        case "FIREFOX":
            System.out.println("FIREFOX BROWSER IS SELECTED");
            break;
        case "OPERA":
            System.out.println("OPERA browser selected");
            break;
        case "EDGE":
            System.out.println("EDGE browser selected");
            break;
        case "IE":
        	
            System.out.println("IE browser selected");
            break;
            default :
                System.out.println("INVALID BROWSER");
        }
			
			
	}		
			
			
		}
		
		
		
		
	                
	                
	                
	                
	                
	                
	                
	        
	
		
		
		
		
		
		
		
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


