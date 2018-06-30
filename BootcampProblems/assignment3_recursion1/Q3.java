package BootcampProblems.assignment3_recursion1;

//Given k find the geometric Sum i.e. 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)

public class Q3 {
	
	public static double gpsum(int k)
	{
		if(k == 0)
			return 1;			
		return ( 1 / Math.pow(2, k)) + gpsum(k-1);
	}
	public static void main(String[] args) {
		System.out.println(gpsum(5));
	}
}
