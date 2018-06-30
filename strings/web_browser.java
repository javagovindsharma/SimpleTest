package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by Govind on 2/05/2017

In the race for the best Internet browser, there's now a new contender for it, this browser is called the: "The Semantic Mind-Reader!" After its promo on the world wide web, everyone's been desperately waiting for the browser to be released. And why shouldn't they be curious about it, after all, it's the new project of our very own genius "Little Jhool!" He's worked very hard for this browser, and to add new mind reading features to it.

        Apart from the various security powers it possesses, it's called the mind-reader for a reason. Here's why:

        You don't need to type 'www.' to open a website anymore.
        Though, you still need to type '.com' to open a website.
        The browser predicts ALL THE VOWELS in the name of the website. (Not '.com', though. Again!)
        Obviously, this means you can type the name of a website faster and save some time.
        Now to convince users that his browser will indeed save A LOT of time for users to open a particular website, Little Jhool has asked you to prepare a report on the same.

        Input format:
        The first line contains tc, the number of test cases.
        The second line contains the name of websites, as a string.

        Output format:
        You have to print the ratio of characters you would have typed in Jhool's browser, to your normal browser.

        Constraints:
        1 <= tc <= 100
        1 <= Length of the website <= 200

        NOTE: You do NOT need to print the output in its lowest format. You should print in its original fraction format.
        The names of all the websites will be in small case only.

        Every string will start from *www. and end with *.com, so well!**

 */


public class web_browser {
    public static void main(String args[] ) throws Exception {

        // Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;
        System.out.println("Enter no of test case : ");
        n = Integer.parseInt(br.readLine());
        while (n < 1 || n > 100)
        {
            System.out.println("Enter no of test case between 1 and 100 : ");
            n = Integer.parseInt(br.readLine());
        }

        System.out.print("Enter strings");
        String[] url = new String[n];
        for(int i = 0 ; i < n ; i++)
        {
            url[i] = br.readLine();
            if(url[i].length() > 200 || url.length <= 1)
            {
                System.out.print("Url length must be between 1 and 200");
                i--;
            }
        }

        Set<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        for (int i = 0 ; i < url.length ; i++)
        {
            String[] url_part = url[i].split(Pattern.quote("."));
            int url_size = url[i].length();
            int vowel_count = 0;

            for(int j = 0 ; j < url_part[1].length() ; j++)
            {
                if(vowel.contains(url_part[1].charAt(j)))
                    vowel_count++;
            }
            System.out.println(( url_part[1].length() - vowel_count + url_part[2].length() + 1)
                    + "/" + url_size);

        }

    }
}
