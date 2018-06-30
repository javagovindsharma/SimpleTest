package BootcampProblems.assignment2_strings;

//Find minimum length word in a string. 

public class Q3 {

	public static String min_length(String s){
		String s_min = s;
		int min = s.length();
		String [] s1 = s.split(" ");
		for (int i = s1.length-1 ; i>=0 ; i--) {
			if(s1[i].length() < min)
			{
				min = s1[i].length();
				s_min = s1[i];
			}
		}
		return s_min;
		
	}
	public static void main(String[] args) {
		String s = "Welcome to to coding blocks";
		System.out.println(min_length(s));
		
	}
}
