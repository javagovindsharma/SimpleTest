package BootcampProblems.assignment4_recursion2;

//Implement Binary Search Recursively

public class Q1 {
	public static int BinarySearch(int[] arr , int low , int high, int key) {
		if(low < high) {
			int mid = ( low + high ) / 2;	
			if(arr[mid] == key )
				return mid;
			else if(arr[mid] > key)
				return BinarySearch(arr, low, mid, key);
			else if(arr[mid] < key)
				return BinarySearch(arr, mid+1, high, key);
		}
		return -1;
	} 
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(BinarySearch(arr, 0, 5, 6));
	}

}
