package Day12_NestedLoop;

import java.util.Scanner;

public class HomeWorkNestedLoopTask {

	public static void main(String[] args) {
		/*
		 * # Nested Loop Tasks ## Task A - Print the following (Nested Loop)
		 * 
		 * Write java program that print this on the console
		 * 
		 * ```text 1 2 3 4 5 6 7 8 9   
		 *         2 4 6 8 10 12 14 16 18 
		 *         3 6 9 12 15 18 21 24 27 
		 *         4 8 12 16 20 24 28 32 36 
		 *         5 10 15 20 25 30 35 40 45 
		 *         6 12 18 24 30 36 42 48 54 
		 *         7 14 21 28 35 42 49 56 63 
		 *         8 16 24 32 40 48 56 64 72 
		 *         9 18 27 36 45 54 63 72 81 ```
		 * 
		 */
////		
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int n=sc.nextInt();
//        
//        for(int i =1; i <=10; i++)
//     
//       	System.out.println(i + "x"+ n+" = " +i*n);
//        

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				// System.out.println(i + "*" +j+"=" +i*j);
				System.out.print(i * j + " ");
			}

			System.out.println();
		}

	}

}
