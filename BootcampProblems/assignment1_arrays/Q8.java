package BootcampProblems.assignment1_arrays;

//You are given with an array containing only 0’s and 1’s. Write a function to
//sort this array. Find a solution, which scans the array only once.

public class Q8 {
	public static void sortarray(int[] arr)
	{
	    int left = 0, right = arr.length-1;
	
	    while (left < right)
	    {
	        while (arr[left] == 0 && left < right)
	            left++;
	 
	        while (arr[right] == 1 && left < right)
	            right--;
	 
	        
	        if (left < right)
	        {
	            arr[left] = 0;
	            arr[right] = 1;
	            left++;
	            right--;
	        }
	    }
	}
	
	public static void main(String[] args) {
		int arr[] = {0,0,0,2,0,1,0,0,1,0,2,0,1,1,1,0,0,1};
		
		sortarray(arr);
		
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
		
	}
}
