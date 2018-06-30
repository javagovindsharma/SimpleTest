package patterns;

/**
 * Created byGovind on 18/04/2018
 */
public class Pattern_1 {

    public static void print_pattern(int n){
        int count = 1;
        for( int i = 0 ; i < 2*n -1 ; i++)
        {
            for( int j = 0 ; j < Math.abs(n - 1 -i) ; j++) {
                System.out.print("\t");
            }
           for(int j = 0 ; j < 2*(n - Math.abs(n-1-i))-1 ;j++)
           {
               System.out.print(count++ + "\t");
           }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        print_pattern(4);
    }
}
