package Lecture6;

public class lexicographical {
	
	public static void printorder(int n)
	{
		for(int i = 1 ; i < 10 ; i++)
			printorder(n,i);
	}
	
	public static void printorder(int n,int numsofar)
	{
		if(numsofar > n)
			return ;
		System.out.println(numsofar);
		for(int i = 0 ; i < 10 ; i++ )
			printorder(n,numsofar*10+i);
	}

	
	public static void main(String[] args) {
		printorder(1000);
	}
}
