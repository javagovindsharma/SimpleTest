package linkedinPlacements;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by  Govind on 3/04/2018
 */
public class maxElement {


    public static int maxElement(int[] arr) {
//        int maxElement = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(maxElement < arr[i])
//                maxElement = arr[i];
//        }
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 1; j < arr.length; j++) {
//                set.add(arr[i]*arr[j]);
//            }
//        }
//        if (set.contains(maxElement))
//            return maxElement;
//        return -1;

//
//        int maxElement = 0;
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 1; j < arr.length; j++) {
//                if(i != j)set.add(arr[i]*arr[j]);
//            }
//            if(maxElement < arr[i])
//                maxElement = arr[i];
//        }
//
//        if(maxElement < arr[arr.length - 1])
//            maxElement = arr[arr.length -1];
//
//        if (set.contains(maxElement))
//            return maxElement;
//        return -1;


        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxElement < arr[i])
                maxElement = arr[i];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (maxElement == arr[i] * arr[j])
                    return maxElement;
            }
        }
        return -1;


    }
//    2 4 4 6 8



    public static void main(String[] args){
        int[] arr = new int[]{0,2,2,4,3};
        System.out.print(maxElement(arr));
    }
}
