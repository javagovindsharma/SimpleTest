package BootcampProblems.assignment2_strings;

//Write a program to multiply 2D arrays A and B of dimensions NxL and LxM 
//respectively. 



public class Q9 {
		
	public static int[][] multiply(int[][] arr1, int[][]arr2) {
		int arr1_row = arr1.length;
		int arr2_col = arr2[0].length;
		int[][] arr3 = new int[arr1_row][arr2_col];
		
		for(int i = 0 ; i < arr1_row ; i++)
		{
			for(int j = 0 ; j < arr2_col ; j++)
			{
				int sum = 0;
				for(int k = 0 ; k < arr2.length ; k++)
				{
					sum += arr1[i][k] * arr2[k][j];
					
				}
				arr3[i][j] = sum;
			}
		}
		return arr3;
		
	}
	
	public static void printmatrix(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j =0 ; j < arr[0].length ; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{10,2,3}};
		int[][] arr2 = {{1,2},{3,4},{5,6}};
		int[][] arr = multiply(arr1, arr2);
		if (arr1[0].length == arr2.length)
			printmatrix(arr);	
	}
	
}
