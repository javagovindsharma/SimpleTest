package strings;

import java.util.HashMap;

/**
 * Created by Govind on 2/05/2017
 */

// check two string for anagram using Hashmap

public class Anagram {

    public static boolean checkAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        HashMap<Character,Integer> cMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if(!cMap.containsKey(s1.charAt(i)))
                cMap.put(s1.charAt(i),0);
            else {
                int value = cMap.get(s1.charAt(i));
                cMap.put(s1.charAt(i),value + 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if(cMap.containsKey(s2.charAt(i))) {
                int value = cMap.get(s2.charAt(i));
                if (value == 0)
                    cMap.remove(s2.charAt(i));
                else
                    cMap.put(s2.charAt(i), value - 1);
            }
        }
        return cMap.size()==0 ? true: false;
    }

    public static void main(String[] args)
    {
        System.out.print(checkAnagram("abac","cbaa"));
    }
}
