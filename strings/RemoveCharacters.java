package strings;

/**
 * Created by Govind on 2/05/2017
 */

import java.util.HashSet;
import java.util.Set;

/**
 Remove the characters in 1st string which occurred in 2nd and print it.

i/p:crazytechnogeeks
       ae
o/p:crzytchnogks

 */
public class RemoveCharacters {

    public static void printRemovedCharacterString(String str1, String str2)
    {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < str2.length() ; i++) {
            s.add(str2.charAt(i));
        }
        String newString = "";
        for (int i = 0; i < str1.length(); i++) {
            if(s.contains(str1.charAt(i)))
                continue;
            else
                newString += str1.charAt(i);
        }

        System.out.print(newString);
    }

    public static void main(String[] args)
    {
        printRemovedCharacterString("crazytechnogeeks","ae");
    }
}
