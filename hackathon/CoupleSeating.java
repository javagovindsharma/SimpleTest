package hackathon;

import java.util.*;

/**
 * Created by Govind on 29/04/2018
 */

/*
 Couple seating problem for example 3 couples
    Possible seating combination such that no women sits on the left of the husband
    for eg - HHHWWW is accpeted
    HWHWHW is also accepted
    HWWHHW is not accepted as 2nd women is the left
    WWWHHH is also not accepted and so on

    for 3 couples such number of possible combinaton (accepted Combinations) will be 5.

     Input - 3
     output - 5
 */
public class CoupleSeating {

    public static String[] permutationOfString(String str ) {
        if(str.length() == 0)
        {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        String[] smallerOutput = permutationOfString(str.substring(1));
        String[] output = new String[str.length() * ((smallerOutput.length == 0)? 1 : smallerOutput.length)];
        int i = 0;
        for(String s : smallerOutput) {
            for(int j = 0 ; j <= s.length() ; j++) {
                output[i] = s.substring(0, j) + str.charAt(0) + s.substring(j, s.length());
                i++;
            }
        }
        return output;
    }

    public static int combinations(int n){
        String str = "";
        for (int i = 0; i < 2*(n-1); i++) {
            if ( i < (n-1))str += "H";
            else str += "W";
        }
        String[] permutations = permutationOfString(str);
        Set<String> uniquePermutation = new HashSet<>();
        for (int i = 0; i < permutations.length; i++) {
           if(isAccepted("H"+permutations[i]+"W")) {
               uniquePermutation.add("H" + permutations[i] + "W");
           }
        }
        return  uniquePermutation.size();
    }

    public static boolean isAccepted(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'H')
                stack.push('H');
            else if(str.charAt(i) == 'W') {
                    if(stack.isEmpty())
                        return false;
                    stack.pop();
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n > 1 && n <100 )
            System.out.print(combinations(n));
    }
}
