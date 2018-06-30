package numbers;

/**
 * Created by  Govind on 13/04/2018
 */

//Find numbers 1-1000 which are even and divisible by 7 and also sum of individual digit is 7.

public class FindNumbers {

    public static boolean IsDivisibleBy7(int num){
        return num % 7 == 0;
    }
    public static int sumOfdigits(int num) {
        if(num / 10 == 0)
            return num;
        return num % 10 + sumOfdigits(num / 10);
    }
    public static boolean IsEven(int num)
    {
        return num % 2 == 0;
    }

    public static void printNumber()
    {
        for (int i = 0; i < 1000; i++) {
            if(sumOfdigits(i) == 7 && IsEven(i) && IsDivisibleBy7(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
       printNumber();
    }

}
