package arrays;

/**
 * Created by Govind on 29/06/2018
 */

// find largest element in an array without using any extra memory ie temporary variable or function.

public class LargestElement {
    public static int findLargestArray(int[] arr,int low) {
        if (low == arr.length - 1)
            return arr[low];
        if (arr[low] < findLargestArray(arr,low + 1))
            return  findLargestArray(arr,low + 1);
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,2,21,2,35,2,5,4,1};
        System.out.print(findLargestArray(arr,0));
    }
}
