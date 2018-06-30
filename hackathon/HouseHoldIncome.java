package hackathon;

import java.util.Scanner;

/**
 * Created by  Govind on 29/04/2018
 */

public class HouseHoldIncome{
    public static void calculator(int[] arr) {
        int sum = 0;
        float[] output = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            output[i] = (float) sum/(i+1);
        }
        for(int i = 0 ; i < output.length ; i++)
            System.out.printf("%.2f ",output[i]);
    }

    public static void main (String[] args) {
        int input;
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextInt();
        int arr[]=new int[input];
        for(int i=0;i<input;i++)
            arr[i]=scanner.nextInt();
        calculator(arr);

    }
}
