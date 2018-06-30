package patterns;

/**
 * Created by Govind on 22/04/2018
 */
//        *
//    *   A   *
//*   A   *   A   *
public class Pattern_8 {

    public static void print(int n)
    {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(j%2 == 0?"*":"A");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n - i -1 ) -1; j++) {
                System.out.print(j%2 == 0?"*":"A");
            }
            System.out.println();
        }


    }
    public static void main(String[] args)
    {
        print(4);
    }
}
