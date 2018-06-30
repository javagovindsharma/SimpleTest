package BootcampProblems.assignment1_arrays;

//You are given two arrays. Find the sum of the two arrays and put the result in
//another array. E.g. if you are given [1,2,4] and [4,5,6] the output should be
//[5,8,0].

public class Q4_arraySum {
	
	public static int power(int num , int power){
		int res = 1;
		for(int i= 0 ; i< power ; i++)
		{
			res *= num;
		}
		return res;
	}
	
	public static int[] addarray(int[] arr1, int[] arr2) {
		int no1=0;
		int counter1 = arr1.length-1;
		for(int i = 0 ; i < arr1.length ; i++){
			no1 += (arr1[i] * power(10,counter1));
			counter1--;
		}
		System.out.println(no1);

		int no2=0;
		int counter2 = arr2.length-1;
		for(int i = 0 ; i < arr2.length ; i++){
			no2 += (arr2[i] * power(10, counter2));
			counter2--;
		}
		System.out.println(no2);

		int result = no1 + no2;
		String s = Integer.toString(result);
		System.out.println(s);

		int[] arr = new int[s.length()];
		for(int i = 0 ; i < arr.length ; i++ ){
			arr[i] = Character.getNumericValue(s.charAt(i));

		}
		return arr;
		
	}
	
	public static void printarray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		int[] arr1 = {9,2,3,4};
		int[] arr2 ={14,2,3,4};
		int[] result_arr = addarray(arr1, arr2);
		printarray(result_arr);
		
		
		
	}
}
