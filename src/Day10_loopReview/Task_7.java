package Day10_loopReview;

public class Task_7 {

	public static void main(String[] args) {
		/*
		 * write a program that can find the number of days in a month
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
//		
//		int month = 1;
//		int yr = 4;
//		Boolean leap = (yr == 4);
//
//		if (month >= 1 && month <= 12) {
//		    if (month == 2) {
//		        if (leap) {
//		            System.out.println("Month " + month + " has 29 days, because it's a leap year.");
//		        } else {
//		            System.out.println("Month " + month + " has 28 days, because it's not a leap year.");
//		        }
//		    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//		        System.out.println("Month " + month + " has 30 days.");
//		    } else {
//		        System.out.println("Month " + month + " has 31 days.");
//		    }
//		} else {
//		    System.out.println("Invalid month.");
//		    
//		    
		    //    
		    int month = 1;
	        int days;
	        
	        switch(month) {
	        case 1: 
	            
	        case 3:
	        
	        case 5:
	        
	        case 7:
	        
	        case 8:
	            
	        case 10:
	        
	        case 12:
	            days = 31;
	            System.out.printf("The number of days in this month is %d", days);
	            break;
	        case 4:
	        
	        case 6:
	        
	        case 9:
	        
	        case 11:
	            days = 30;
	            System.out.printf("The number of days in this month is %d", days);
	            break;
	        case 2:
	            days = 28;
	            System.out.printf("The number of days in this month is %d", days);
	            break;
	        
	        default:
	            System.out.println("Invalid Input");
	        }
	        
		
		}
		
		
		
		
	}


