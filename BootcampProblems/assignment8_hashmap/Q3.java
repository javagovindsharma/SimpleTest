package assignment8;

import java.util.ArrayList;
import java.util.HashMap;

//You are given with an array of integer contain number in no particular order. 
//Write a program find the longest possible sequence of consecutive numbers 
//using the numbers from the array. Best solution takes O(n) time.  E.g. 
//Input = [2,12,9,16,10,5,3,20,25,11,1,8,6]   Output=[8,9,10,11,12]
// 
//Input = [15, 13, 23, 21, 19, 11, 16]    Output = [15, 16] 

public class Q3 {

	public static ArrayList<Integer> longestSeq(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int start = 0, end = arr.length, max = 0;
		int temp_start, temp_end, count;

		for(int element : arr)
			map.put(element, null);
		for(int element : arr)
		{
			int number = element;
			count = 1 ;
			temp_end = temp_start = number;
			while(map.containsKey(number -1))
			{
				temp_start = number - 1;
				count++;
				map.remove(number-1);
				number--;
			}
			while(map.containsKey(number + 1))
			{
				temp_end = number + 1;
				count++;
				map.remove(number +1 );
				number++;
			}
			if(max < count)
			{
				max = count;
				start = temp_start;
				end = temp_end;
			}
//			else
//				map.clear();
		}

		for( int i = start ; i <= end ; i++)
			list.add(i);
		
		return list;
	}
	public static void main(String[] args) {
		int [] arr = {2,3,4,12,9,16,10,5,20,25,11,1,8,6};
		ArrayList<Integer> list = new ArrayList<>();
		list = longestSeq(arr);
		for(int element : list)
			System.out.println(element);
	}
	
}
