package linkedinPlacements;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Govind on 3/04/2018
 */
public class string {
    public static int score(String s) {
        int score = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (Character c : set) {
            score += getWeight(c);
        }
        return score;
    }

    public static int getWeight(char c) {
        if(c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u' )
            return 1;
        return 2;
    }

    public static void main(String[] args) {
        System.out.print(score("abcdabcc"));
    }


}
