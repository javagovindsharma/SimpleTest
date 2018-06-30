package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Govind on 29/06/2018
 */
public class MeanMode {


    public static void findMode(int [] arr){
        int k= arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i]%k] += k;
        }

        ArrayList<Integer> al=new ArrayList<>();

        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]/k>max){
                max=arr[i]/k;
                al.clear();
                al.add(i);
            }
            else if(arr[i]/k==max){
                al.add(i);
            }
            arr[i]%=k;
        }

        System.out.print("mode :");

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }

    public static int sumOfArray(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void findMeanMode(int[] numArray){
        int mean = sumOfArray(numArray)/numArray.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : numArray) {
            Integer count = map.get(i);
            map.put(i, count != null ? count+1 : 0);
        }
        Integer maxValue =0, mode = null;
        for( Integer i : map.keySet()) {
            if (mode == null)
                mode = i;
            if (map.get(i) > maxValue) {
                mode = i;
                maxValue = map.get(i);
            }
        }

        System.out.print("Mean : " + mean);
        findMode(numArray);
    }

    public static void main(String[] args){
        findMeanMode(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 7});
//        findMode(new int[]{1,2,3,4,5,6,6,7,7});
    }

}
