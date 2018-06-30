package BootcampProblems.assignment1_arrays;

//Given an array of integers A and an integer x. Find triplets of elements in A
//which sum to x.

public class Q7 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int x= 15;
		int length = arr.length;
		for(int i = 0 ; i < length - 3; i++)
		{
			for(int j = 1; j< length - 2 ; j++ ){
				for( int k = 2 ; k < length-1 ;k++){
					int sum = arr[i]+arr[j]+arr[k];
					if (sum == x)
						System.out.println(arr[i] + " "+arr[j]+" "+arr[k]);
					
				}
			}
		}
		
		
	}
}
