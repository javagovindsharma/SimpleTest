package patterns;

/**
 * Created by  Govind on 20/04/2018
 */

//pyramids
//    Hollow pyramid
//    diamond
//    right arrow star pattern
//    left arrow star pattern

public class Pattern_6 {

    public static void hollow_pyramid(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < Math.abs( n - i -1) ; j++ )
                System.out.print(" ");
            for(int j = 0 ; j < 2*( n - Math.abs(n-i-1))-1 ; j++)
            {
                if( i == n - 1 || j == 0 || j == (2*( n - Math.abs(n-i-1))-1)-1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }

    public static void star_pyramid(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < Math.abs( n - i -1) ; j++ )
                System.out.print(" ");
            for(int j = 0 ; j < 2*( n - Math.abs(n-i-1))-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n)
    {
        for(int i = 0 ; i < 2*n-1 ; i++)
        {
            for(int j = 0 ; j < Math.abs( n - i -1) ; j++ )
                System.out.print(" ");
            for(int j = 0 ; j < 2*( n - Math.abs(n-i-1))-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_diamond(int n)
    {
        for(int i = 0 ; i < 2* n -1; i++)
        {
            for(int j = 0 ; j <= Math.abs( n - i -1) ; j++ )
                System.out.print("*");
            for(int j = 0 ; j < n ; j++)
            {
                if(j < (n - Math.abs(n-i-1)-1))
                    System.out.print("  ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightArrowStarPattern(int n){

        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j < 2*i ; j++)
                System.out.print(" ");
            for(int j = 0 ; j < n-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j < 2*n - 2*i -2; j++)
                System.out.print(" ");
            for(int j = 0 ; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void leftArrowStarPattern(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0 ; j < n-i-1; j++)
                System.out.print(" ");
            for ( int j = 0 ; j < n ; j++)
            {
                if(j < n-i)
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0 ; j < i; j++)
                System.out.print(" ");
            for ( int j = 0 ; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
//        star_pyramid(5);
//        System.out.println("\n\n");
//        hollow_pyramid(5);
//        System.out.println("\n\n");
//        diamond(5);
//        System.out.println("\n\n");
//        hollow_diamond(5);
//        rightArrowStarPattern(5);
        leftArrowStarPattern(5);
    }

}

