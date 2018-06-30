package BootcampProblems.Lecture7;

public class powerrecursion {
	
	public static int power(int n,int p)
	{
		if(p==0)
			return 1;
		int ans = power(n,p/2);
		if(p%2 == 0)
			return ans*ans;
		else
			return ans*ans*n;
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,6));
		
	}

}
