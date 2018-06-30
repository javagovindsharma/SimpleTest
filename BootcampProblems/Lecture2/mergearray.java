package Lecture2;

public class mergearray {
	
	public static int[] merge(int [] arr1 , int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		int arr1_index = 0, arr2_index = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr1[arr1_index] < arr2[arr2_index])
			{
				arr[i] = arr1[arr1_index];
				arr1_index++;
			}
			else if(arr2[arr2_index]< arr1[arr1_index])
			{
				arr[i] = arr2[arr2_index];
				arr2_index++;
			}
			else if(arr2[arr2_index] == arr1[arr1_index])
			{
				arr[i] = arr1[arr1_index];
				arr1_index++;
				arr2_index++;
			}
			
			else if(arr1_index == arr1.length-1 && arr2_index < arr2.length-1)
			{
				arr[i] = arr2[arr2_index];
				arr2_index++;
			}
			
			else if(arr2_index == arr2.length-1 && arr1_index < arr1.length-1)
			{
				arr[i] = arr1[arr1_index];
				arr1_index++;
			}
			
		}
			
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] arr1 ={1,2,3,44,55,66};
		int[] arr2 ={4,5,46,52,60};
		merge(arr1, arr2);
	}

}
