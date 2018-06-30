package thoughtworksGradDevExer;

/**
 * Created by Govind on 12/05/2018
 */
public class Sorting {
    public static void bubbleSort(int[] arr){
        boolean swap = false;
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (swap == false)
                return;
        }
    }

    public static void quickSort(int[] arr, int low , int high) {
        if(low < high) {
            int pivot = partition(arr,low,high);
            quickSort(arr,low, pivot);
            quickSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (true)
        {
            while (arr[i] < pivot && arr[i] != pivot)
                i++;
            while (arr[j] > pivot && arr[j] != pivot)
                j--;
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else
                return j;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 34, 565, 232, 9, 0, 342, 31, 1411};
//        bubbleSort(arr);
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
