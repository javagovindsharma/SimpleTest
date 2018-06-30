package BootcampProblems.assignment1_arrays;

import java.util.Scanner;

//Write a program to find square root of an input.
//a. Just find the integral part b.
//b. Find the square root with an accuracy of n decimal points, n is
//provided by the user.


public class Q2_sqrt {
		public static double calculateSqrt (int n) {
	
			double rootValue = 1.00;
			double num = n;
			for (int i = 0; i < n; i++) {
				rootValue = ((rootValue + num/rootValue))/2;
			}
			
			return rootValue;
		}

		public static void main (String[] args) {
			int num,decimal_places;
			@SuppressWarnings("resource")
			Scanner input = new Scanner (System.in);
			System.out.println("Enter Number to find its square root-");
			num = input.nextInt();
			
			System.out.println("Upto how many decimal places -");
			decimal_places = input.nextInt();
			double sqrt = calculateSqrt(num);
			
			
			
			System.out.printf("Root Value Calculated : %."+ decimal_places +"f" +"\n", sqrt);
			
			System.out.println("Intergral part : " + (long)sqrt);

			System.out.println("Root Value By InBuild Method Method : " + Math.sqrt(num));
		
		}
		
}
