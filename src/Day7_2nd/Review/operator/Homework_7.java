package Day7_2nd.Review.operator;

import java.util.Scanner;

public class Homework_7   {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);{

        System.out.println("Enter 3 numbers one by one");
        int iP1 = sc.nextInt();
        int iP2 = sc.nextInt();
        int iP3 = sc.nextInt();
        sc.close();
        boolean descendingOrder = iP1 > iP2 && iP2 > iP3;

        if (descendingOrder) {
            System.out.println("True");
        } else {
            System.out.println("False");

        } }
	}
	

	}
        
        
        
        
        


