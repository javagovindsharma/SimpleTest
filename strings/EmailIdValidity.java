package strings;

import java.util.regex.Pattern;

/**
 * Created by Govind on 2/05/2017
 */

//Check if email-id is valid or not.
/*

// regex [_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"
   *  ^                     * start of the line
   [_A-Za-z0-9-]+      * expression inside[ ] indicates string can only contain alphabets,digits
                         (+)  must contains one or more
   (                   * start of group 1
    \\.[_A-Za-z0-9-]+  * must be followed by a dot "." and string in the bracket [ ],
                         (+)  must contains one or more
   )*                  * end of group 1, (*) indicates that this group is optional
   @                   * must contains "@" symbol
   [A-Za-z0-9-]+       * follow by [] a string that can only contain alphabets,digits
                         (+)  must contains one or more
  (                    * start of group 2 - first level : Top Level Domain checking
   \\.[A-Za-z0-9-]+    * follow by a dot "." and string in the bracket [ ], must contains one or more (+)
  )*                   * end of group 2, this group is optional (*)
  (                    * start of group 3 - second level :Top Level Domain checking
   \\.[A-Za-z]{2,}     * follow by a dot "." and [] a string that can only contain alphabets with minimum
                         length of 2
  )                    * end of group 3
  $                      * end of the line
*/

public class EmailIdValidity {

    public static void IsEmailValid(String emailID){
        String emailRegex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        boolean isValid =  emailID.matches(emailRegex);
        System.out.print(isValid);
    }

    public static void main(String[] args) {
        IsEmailValid("pha3019@gmail.com");
    }
}
