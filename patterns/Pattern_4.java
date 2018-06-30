package patterns;

/**
 * Created by Govind on 16/04/2018
 */
//        123456
//        212345
//        321234
//        432123
//        543212
//        654321

public class Pattern_4 {

    public static void printpattern(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(i>=j?(i - j + 1):(j - i + 1));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printpattern(6);

    }
}
