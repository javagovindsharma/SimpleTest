package codingchallenge.postpaidBillUsageProblem.inputParser;

/**
 * Created by Govind on 29/06/2018
 */
public class ParseInput {

    public static String[] parseInput(String inputString) {
        String[] strings = inputString.split(" ");
        String[] returnString = new String[3];
        if (strings.length == 6) {
            returnString[0] = strings[0];
            returnString[1] = strings[2];
            returnString[2] = strings[3];
        }
        else if(strings.length == 5){
            returnString[0] = strings[0];
            returnString[1] = strings[1];
            returnString[2] = strings[2];
        }
        return  returnString;
    }
}
