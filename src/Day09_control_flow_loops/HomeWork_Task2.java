package Day09_control_flow_loops;

import java.io.InputStream;
import java.util.Scanner;

public class HomeWork_Task2 {

	public static void main(String[] args) {
		
		// CampusTime time 1-24, campus open 8-23.
		 int time = 0;
		 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter time");
		 time = scan.nextInt();
		 if (time >= 8 && time <=23) {
			 System.out.println("open");
		 }else {
			 System.out.println("closed");
		 
		 
		 
		

	}
scan.close();

	}

	private static Scanner newScanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	

	
	}

}
