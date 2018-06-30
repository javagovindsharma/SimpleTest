package Lecture3Recursion;

public class Powerrecursion {
	public static int power(int x , int n) {
		if (n == 0)
			return 1;	
		return x * power(x,n-1);
	}
	
	public static int powerbetter(int x , int n) {
		if (n == 0)
			return 1;	
		int temp = power(x, n/2);
		if(n % 2 == 0)
			return temp*temp;
		else
			return x * temp * temp;
		
		
	}

	public static void main(String[] args) {
		System.out.println(powerbetter(2,5));
		System.out.println(powerbetter(2,6));
		
	}
}
