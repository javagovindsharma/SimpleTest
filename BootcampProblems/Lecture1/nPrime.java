package Lecture1;

import java.util.Scanner;

/**
 * Created by parvez on 8/3/16.
 */
public class nPrime {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        boolean prime = true;
        System.out.print("Enter Max number :");
        int n = s.nextInt();
        for (int i = 3 ; i < n ; i++){
            for (int j = 2 ; j < i ; j++ ){
                if ( i % j == 0 ){
                    prime = false;
                    break;
                }

            }
            if(prime == true)
                System.out.println(i);
            prime = true;

        }
        s.close();
    }
}
