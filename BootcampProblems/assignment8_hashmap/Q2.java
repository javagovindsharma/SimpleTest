package assignment8;

import java.util.ArrayList;
import java.util.HashMap;

//Write an efficient function for extracting unique characters from a given string.

public class Q2 {

	public static ArrayList<Character> uniquechar(String str)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		ArrayList<Character> list = new ArrayList<>();
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), 1);
				list.add(str.charAt(i));
			}
		}
		return list;
		
	}
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		list = uniquechar("My Name is Parvez");
		for(Character item : list)
		{
			System.out.println(item);
		}
	}
	
}
