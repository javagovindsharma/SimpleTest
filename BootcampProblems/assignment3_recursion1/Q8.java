package BootcampProblems.assignment3_recursion1;

//Write a function that returns the sum of the digits of an integer.

public class Q8 {

	public static int sumofdigits(int num) {
		if(num / 10 == 0)
			return num;
		num = num%10 +  sumofdigits(num/10);
		return num;
	}
	public static void main(String[] args) {
		System.out.println(sumofdigits(999));
	}
}
