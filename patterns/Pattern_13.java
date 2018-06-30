package patterns;

/**
 * Created by Govind on 2/05/2018
 */
/*
                                    1
                                1   2   1
                            1   2   4   2   1
                        1   2   4   8   4   2   1
                    1   2   4   8  16   8   4   2   1
                1   2   4   8  16  32  16   8   4   2   1
            1   2   4   8  16  32  64  32  16   8   4   2   1
        1   2   4   8  16  32  64 128  64  32  16   8   4   2   1
        */
public class Pattern_13 {

    public static int power(int n )
    {
        if (n == 0)
            return 1;
        return 2*power(n-1);
    }

    public static void printPowerTriangle(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2*i +1 ; j++) {
                System.out.print( j <= i ? power(j) + "\t" : power( (2 * i) -j ) + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2*(n - i) -1 ; j++) {
                if(j <= n - i -1)
                    System.out.print(power(j) + "\t");
                else
                    System.out.print(power(2*n - (2*i) - j - 2 )+"\t");
            }
            System.out.println();

        }
    }

    public static void main(String[] args)
    {
        printPowerTriangle(4);
    }
}
