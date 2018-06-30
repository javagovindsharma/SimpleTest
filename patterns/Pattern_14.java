package patterns;

/**
 Created by Govind on 2/05/2018
 */

/*
										1
								1		2		1
						1		2		6		2		1
				1		2		6		24		6		2		1
		1		2		6		24		120		24		6		2		1
1		2		6		24		120		720		120		24		6		2		1
		1		2		6		24		120		24		6		2		1
				1		2		6		24		6		2		1
						1		2		6		2		1
								1		2		1
										1


* */

public class Pattern_14 {

    public static int factorial(int n)
    {
        if ( n == 0)
            return 1;
        return n * factorial(n-1);
    }

    public static void printFactorialPattern(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("\t\t");
            }
            for (int j = 0; j < 2*i + 1 ; j++) {
               if(j<=i)
                   System.out.print(factorial(j+1)+"\t\t");
                else
                   System.out.print(factorial((2*i +1)-j) + "\t\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("\t\t");
            }
            for (int j = 0; j < 2*(n - i) - 3; j++) {
                if(j < n-i-1)
                    System.out.print(factorial(j+1) +"\t\t");
                else
                    System.out.print(factorial(2*n - (2*i + 1)-j -2)+"\t\t");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        printFactorialPattern(6);
    }
}
