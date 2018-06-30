package patterns;

/**
 * Created by Govind on 16/04/2018
 */

//        555555555
//        544444445
//        543333345
//        543222345
//        543212345
//        543222345
//        543333345
//        544444445
//        555555555

public class Pattern_2 {
    public static void print_pattern(int n){

        for(int i = 0 ; i < 2*n -1 ; i++)
        {
            for(int j = 0 ; j < 2*n -1 ; j++)
            {
                System.out.print( 1 + Math.max(Math.abs(n-1-i),Math.abs(n-1-j)));
            }

            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        print_pattern(5);
    }

}
