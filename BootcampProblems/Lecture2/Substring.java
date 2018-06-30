package Lecture2;

import java.util.Scanner;

public class Substring {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String :");
		String str = s.next();
		
		for (int i= 0 ; i < str.length(); i++)
		{
			for(int  j = 1 ; j <= str.length()-i ; j++)
			{
				String substr = str.substring(i, j+i);
				System.out.println(substr);
			}

		}
		s.close();
		
	}

}
