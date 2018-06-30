package numbers;

/**
 * Created by Govind on 13/04/2018
 */
public class FindNumber {

    public static int countDigit(int num)
    {
        if(num / 10 == 0)
            return 1;
        return 1 + countDigit(num/10);
    }

    public static boolean FindNumberPattern(int num, int pattern)
    {
        if(num % Math.pow(10,countDigit(pattern)) == pattern)
            return true;
        if(num / 10 == 0 && pattern != 0 )
            return false;
        boolean temp =  FindNumberPattern(num / 10, pattern);
        if(temp == true)
            return true;
        return false;
    }

    public static boolean findNumberPattern(int num, int pattern) {
        String stringnum = Integer.toString(num);
        String patternString = Integer.toString(pattern);
        return stringnum.contains(patternString);
    }

    public static void main(String[] args){
        System.out.print(FindNumberPattern(123546,23));
//        System.out.print(findNumberPattern(12345,53));
//        System.out.print(countDigit(123));
    }


}
