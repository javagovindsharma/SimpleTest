package patterns;

/**
 * Created by Govind on 28/04/2018
 */
/*
        # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
        #           #      #                        #        #       #      # #       # #
        #           #        #                    #            #   #        #   #   #   #
        #           #          #                #                #          #     #     #
        #           #            #            #                #   #        #   #   #   #
        #           #              #        #                #       #      # #       # #
        # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
*/
public class Pattern_12 {

    public static void printSquareBox(int n)
    {
        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j < n; j++) {
                if(i == 0 || i == n-1)
                    System.out.print("#" + "\t");
                else if(j == 0 || j == n - 1)
                    System.out.print("#" + "\t");
                else if( i == j || i + j == n - 1)
                    System.out.print("#" + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        printSquareBox(7);
    }
}
