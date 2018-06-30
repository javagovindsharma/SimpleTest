package strings;

import java.util.ArrayList;

/**
 * Created by Govind on 2/05/2017
 */
public class StringNumericSum {

    public static boolean isNumeric(char c){
        return Character.isDigit(c);
    }

    public static int getNumericDigitSum(String str){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            if(isNumeric(str.charAt(i))){
                String temp = Character.toString(str.charAt(i));
                i++;
                while(i < str.length() && isNumeric(str.charAt(i)) ){
                    temp += Character.toString(str.charAt(i));
                    i++;
                }
                arrayList.add(Integer.parseInt(temp));
            }
        }
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(getNumericDigitSum("Ab25f3hn32hdhd7"));
    }

}
