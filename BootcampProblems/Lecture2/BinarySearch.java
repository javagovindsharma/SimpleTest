package Lecture2;

public class BinarySearch {
	
	public static int bsearch(int[] arr ,int start ,int end, int key)
	{
		int middle = (start + end) / 2;
	    if(end < start) {
	        return -1;
	    } 

	    if(key == arr[middle]) {
	        return middle;
	    } else if(key < arr[middle]) {
	        return bsearch(arr, start, middle - 1, key);
	    } else {
	        return bsearch(arr, middle + 1, end, key);
	    }
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int key = 45;
		int front = 0;
		int rear = arr.length;
		int position = bsearch(arr, key, front, rear);
		if(position != -1)
			System.out.print("Element found at " + (position+1));
		else 
			System.out.println("Element not found");

			
		
	}
	
}
