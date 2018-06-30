package hackathon;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by  Govind on 29/04/2018
 */

/*
* Print subsequence of a string in a lexographical order
* for input - "ab"
* output -  a
*           ab
 *          b
* */
public class lexographical {
   /* public static void printLexOrder(String str) {
        for(int i = 0 ; i < str.length() ; i++)
            printLexOrder(str, Character.toString(str.charAt(i)));
    }

    public static void printLexOrder(String str,String strsofar) {
        if(strsofar.length() > str.length())
            return ;
        System.out.println(strsofar);
        for(int i = str.indexOf(strsofar.charAt(0))+1 ; i < str.length() ; i++ )
        {
            printLexOrder(str, strsofar + str.charAt(i));
        }
    }
*/
    public static String[] returnsubseq(String str)
    {
        if(str.length() == 0) {
            String[] output = {""};
            return output;
        }
        String[] Smalleroutput = returnsubseq(str.substring(1));
        String[] output = new String[2* Smalleroutput.length];
        for(int i =0 ; i < Smalleroutput.length ; i++)
            output[i] =  Smalleroutput[i];
        for(int i =  0 ; i < Smalleroutput.length ; i++) {
            output[i + Smalleroutput.length] = str.charAt(0) + Smalleroutput[i];
        }
        return output;
    }

    public static void printLexOrder(String str) {
        String[] strings = returnsubseq(str);
        TreeSet<String> stringTreeSet = new TreeSet<>();
        for (int i = 0; i < strings.length; i++) {
            stringTreeSet.add(strings[i]);
        }
        Iterator<String> iterator = stringTreeSet.iterator();
        iterator.next();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while ( n < 0 || n > 10) {
            n = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            String input = s.next();
            while (input.length() > 20) {
                input = s.next();
            }
            printLexOrder(input);
        }
    }

}


