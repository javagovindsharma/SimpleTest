package BootcampProblems.assignment3_recursion1;

//Multiple two numbers m & n using only addition & subtraction. Use Recursion.

public class Q1 {

	public static int multiply(int a, int b) {
		if(b == 0)
			return 0;
		if( b > 0)
			return a + multiply(a, b-1);
		if ( b < 0 )
			return -multiply(a, -b);
		return b;
	}

	public static void main(String[] args) {
		System.out.println(multiply(2, 0));
	}
}

//  5 * 3 = 15
//5 + 5 + 5
