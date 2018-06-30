package BootcampProblems.assignment3_recursion1;

//Count number of zeros in an integer. Use Recursion.

public class Q2 {

	public static int countzero(int num) {
		if(num == 0)
			return 0;
		if(num %10 ==0)
			return 1 + countzero(num / 10);
		else
			return countzero(num/10);
	}
	
	public static void main(String[] args) {
		System.out.println(countzero(1000000011));
	}
}
//123  