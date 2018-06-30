package BootcampProblems.assignment2_strings;

//A sorted array has been rotated by some number k in clockwise direction. 
//Find k. E.g. Input: 5,6,1,2,3,4 Output: 2 
//( Hint : Instead of complete scan try thinking of something similar to binary 
//search )  

public class Q8 {

	public static int rotation(int[] arr, int low,int high){
		int mid = (low + high)/2;
		if(mid == low )
			return mid+1;
		if(arr[low] >arr[high])
		{
			if(arr[mid] < arr[low])
				return rotation(arr,low, mid);
			else
				return rotation(arr, mid,high);
				
		}
		return 0;

	
		
//		int index = arr.length-1;
//		while(arr[index-1] < arr[index] && index >=0)
//			index--;
//		return index;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		System.out.println(rotation(arr,0,arr.length-1));
	}
	
	
}
