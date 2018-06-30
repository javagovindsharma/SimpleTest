package hackathon;

import java.util.Scanner;

/**
 * Created by  Govind on 29/04/2018
 */

/*
* Max sum subarray
* */

public class maxSubArray {

    public static int maxSumSubArray(int[] arr){
        int maxSumSoFar = 0;
        int maxTempsoFar = 0;
        for (int i = 0; i < arr.length ; i++) {
            maxTempsoFar += arr[i];
            if (maxTempsoFar < 0)
                maxTempsoFar = 0;
            else if (maxSumSoFar < maxTempsoFar)
                maxSumSoFar = maxTempsoFar;
        }
        return maxSumSoFar;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int testcase = s.nextInt();
        while(testcase > 1000)
            testcase = s.nextInt();
        for (int i = 0; i < testcase; i++) {
            int size = s.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size ; j++) {
                arr[j] = s.nextInt();
            }
            System.out.println(maxSumSubArray(arr));
        }

    }
}
