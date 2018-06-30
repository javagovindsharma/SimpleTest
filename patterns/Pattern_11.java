package patterns;

/**
 * Created by Govind on 26/04/2018
 */

//print table
/*
 * |  1  2  3  4  5  6  7  8  9
-------------------------------
 1 |  1  2  3  4  5  6  7  8  9
 2 |  2  4  6  8 10 12 14 16 18
 3 |  3  6  9 12 15 18 21 24 27
 4 |  4  8 12 16 20 24 28 32 36
 5 |  5 10 15 20 25 30 35 40 45
 6 |  6 12 18 24 30 36 42 48 54
 7 |  7 14 21 28 35 42 49 56 63
 8 |  8 16 24 32 40 48 56 64 72
 9 |  9 18 27 36 45 54 63 72 81
*/

public class Pattern_11 {

    public static void printTable(int n) {
        for (int i = 0; i < n + 2; i++){
            for (int j = 0 ; j < n + 2 ; j++)
            {
                if( i == 0 )
                {
                    if(j == 0)
                        System.out.print("*" + "\t");
                    if( j == 1)
                        System.out.print("|"+ "\t");
                    if(i== 0 && j > 1)
                        System.out.print( j - 1 + "\t");
                }
                if( i == 1)
                    System.out.print("-"+"\t");
                if(i > 1) {
                    if (j == 0)
                        System.out.print(i - 1 + "\t");
                    if (j == 1)
                        System.out.print("|" + "\t");
                    if(i>1 && j>1)
                        System.out.print((i - 1) * (j - 1)+"\t");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args)
    {
        printTable(9);
    }

}
