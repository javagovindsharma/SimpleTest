package patterns;

/**
 * Created by Govind on 24/04/2018
 */
/*                  1
                2	3	2
            3	4	5	4	3
        4	5	6	7	6	5	4
*/
public class Pattern_9 {

    public static void printNumberPattern(int n)
    {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 0 ; j <= 2*i  ;j++)
            {
                System.out.print( j <= i ? i+j+1 +"\t" : 2*i -(j-i-1) + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("\t");
            }
            for (int j = 0 ; j <=  2*(n-i-1)-2 ;j++) {
                System.out.print(j <= n-i-2 ? (n-i-1)+j +"\t" : 2*n - 2*i -(j-i-1) -2*i+ "\t");
            }
            System.out.println();
        }
    }

    public static void printPattern(int n)
    {
        int count = 1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 0 ; j <= i  ;j++)
            {
                System.out.print(count+"\t\t");
                count += 2;
            }

            System.out.println();
        }

    }

    public static void main(String[] args)
    {
       printPattern(3);
    }
}
