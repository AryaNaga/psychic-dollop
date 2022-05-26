package Day06_controlFlow;

import java.util.Scanner;

public class BathTemperature {

	public static void main(String[] args) {
		// 

        // Create instance of Scanner object
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your bath temperature");
		
        
        int bathTemperature = 57;
        
        
        if (bathTemperature < 90) {
            System.out.println("Brrr!");
        }
        
        if (bathTemperature > 90 && bathTemperature < 95) {
            System.out.println("That's lukewarm!");
        }
        
        if (bathTemperature >= 95 && bathTemperature <=105) {
            System.out.println("Perfect!");
        }
        
	scan.close();
	}

}
