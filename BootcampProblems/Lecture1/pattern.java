package Lecture1;

import java.util.Scanner;


public class pattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = s.nextInt();

        for ( int i = 1 ; i <=n ; i++){
            int value = i;
            for ( int j =  1 ; j <= n ; j++)
            {
                while(j <=  n - i )
                {
                    System.out.print(" ");
                    j++;
                }

                System.out.print(value);
                value ++;
            }

            for (int j = n + 1 ; j < (n + 1) + (i -1) ; j++)
            {
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
        s.close();
    }
}
