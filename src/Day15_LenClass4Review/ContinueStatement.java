package Day15_LenClass4Review;

public class ContinueStatement {

	public static void main(String[] args) {
		// Continue, take java back to the beginning of the loop;
//		
//		int n = 20;
//		for (int i = 0; i < n; i++) {// run n times 
//		
//	//	if (i % 2 != 0) { // check odd number
//			
//			if (i % 2 !== 0) {
//			continue;//  go back to line11, not execute line(line11);
//			
//		
// System.out.print(i+" ");// print even number from 0>n
//		
//		}
//		
		
		   int n = 20;
		      for (int i = 0; i < n; i++) { // run n times
		         if (i % 2 != 0) { // check odd number
		            continue; // go back to line 8, (not execute line 11)
		         }
		         System.out.print(i + " "); // print even number from 0 - n
		      }
		
		
	
		
		
	}

}
