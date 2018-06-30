package patterns;

/**
 * Created by Govind on 20/04/2018
 */
//E
//DE
//CDE
//BCDE
//ABCDE


public class Pattern_5 {

    public static void print(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for( int j = 0 ;  j <= i; j++)
            {
                System.out.print((char)('A'+ n -i + j -1 ));
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        print(5);
    }
}
