package Lecture4;

import java.util.Scanner;


public class Sort {
	public static void  mergeSort(int[] input){
		if(input.length <= 1){
			return;
		}
		int mid = input.length / 2;
		int[] part1 = new int[mid];
		int[] part2 = new int[input.length - mid];
		for(int i = 0; i < part1.length; i++){
			part1[i] = input[i];
		}
		for(int i = 0; i < part2.length; i++){
			part2[i] = input[mid + i];
		}
		mergeSort(part1);
		mergeSort(part2);	
		merge(part1,part2, input);
	}
	
	
	public static void merge(int input1[], int input2[],int[] output){
		int i = 0, j = 0, k = 0;
		
		while(i < input1.length && j < input2.length){
			if(input1[i] < input2[j]){
				output[k] = input1[i];
				i++; 
				k++;
			}
			else{
				output[k] = input2[j];
				j++; 
				k++;
			}
		}
		while(i < input1.length){
			output[k] = input1[i];
			i++;
			k++;
		}
		while(j < input2.length){
			output[k] = input2[j];
			j++;
			k++;
		}
		
	}
//	public static void mergeSort(int[] input){
//
//		if(input.length <= 1){
//			return ;
//		}
//		int beg = 0;
//		int end = input.length - 1;
//		int mid = (beg+end)/2;
//		int part1[] = new int[mid+1];
//		int part2[] = new int[input.length - part1.length];
//		for(int i = 0; i < part1.length; i++){
//			part1[i] = input[i];
//		}
//		for(int i = 0; i < part2.length ; i++){
//			part2[i] = input[i + part1.length];
//		}
//		mergeSort(part1);
//		mergeSort(part2);
//	merge(part1, part2,input);
//	}

	public static void  bubbleSort(int[] input){
		for(int i = 0; i < input.length - 1; i++){
			for(int j = 0; j < input.length - i - 1 ; j++){
				if(input[j] > input[j+1]){
					// swap
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//printKeypad("234", "");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size :");
		int  n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < input.length; i++){
			input[i] = n - i;
		}
		long startTime = System.currentTimeMillis();
		mergeSort(input);
		for(int i = 0; i < input.length; i++)
			System.out.println(input[i]);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by Merge Sort : "+(endTime - startTime));
		for(int i = 0; i < input.length; i++){
			input[i] = n - i;
		}
		 startTime = System.currentTimeMillis();
		bubbleSort(input);
		 endTime = System.currentTimeMillis();
		System.out.println("Time taken by Bubble Sort : "+(endTime - startTime));
		s.close();
		
	}	
}