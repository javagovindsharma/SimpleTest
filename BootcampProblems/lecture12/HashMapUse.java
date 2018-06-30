package BootcampProblems.lecture12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapUse {
	
	public static ArrayList<Integer> removeDuplicates(int[] a)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> array = new ArrayList<>();
		for(int element: a)
		{
			if(!map.containsKey(element))
			{
				array.add(element);
				map.put(element, 1);
			}
		}

		return array;
		
	}
	
	public static void sumofPair(int[] a)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int ele: a)
		{
			if(!map.containsKey(ele))
			{
				map.put(ele, 1);
			}else
			{
				int count = map.get(ele);
				map.put(ele,count+1);
			}
		}
		
		for(int element: a)
		{

			if(map.containsKey(-element))
			{
				int count = map.get(element);
				if(count == 1)
				{
					System.out.println(element + " " + -element);
					map.remove(element);
				}				
				else
				{
					System.out.println(element + " " + -element);
					map.put(element,count-1);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] a = {11,1,21,2,1,2,3,1,4,5,6};
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist = removeDuplicates(a);
		for(Integer Element: arraylist)
		{
			System.out.print(Element + " ");
		}
		System.out.println();
		int[] a1 = {-5,4,-2,-1,1,2,-4,5};
		sumofPair(a1);
		
		
	}

}
