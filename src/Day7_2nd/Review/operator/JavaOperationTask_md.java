package Day7_2nd.Review.operator;

import java.util.Scanner;

public class JavaOperationTask_md {

	public static void main(String[] args) {
		

		/*- you should create a new class called `Solution_A`
		  Write program that can check the order of the 3 integer inputs. if the order that input integer
		  are in descending order (high -> low). the program should return `true`, otherwise return `false`*/
		

	//	Scanner scanner = new Scanner (System.in);
		
	//	int numA = scanner.nextInt();
	//	int nubB = scanner.nextInt();
	//	int numC = scanner.nextInt();
		
		
	//	System.out.printf("%d %d %d , numA, numB numC");
	//	System.out.println();
		// numA > numB ==> numC ==> print true
	//	if (numA > numB && nuB > nubC);
		
		
				
	//			System.out.println(numB > numC);
			
			
			
		 int a, b, c;

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter First Number: ");
	        a = sc.nextInt();
	        System.out.println("Enter Second Number: ");
	        b = sc.nextInt();
	        System.out.println("Enter Third Number: ");
	        c = sc.nextInt();

	        System.out.println(a + " " + b + " " + c);

	        if (a > b && a > c && b > c) {
	            System.out.println(true);
	        } else {
	            System.out.println(false);
	        }
	        sc.close();
		
		
			
		
		

		
		
				
				

	}

}
