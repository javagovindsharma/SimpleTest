package BootcampProblems.assignment2_strings;

import java.util.HashSet;

//Given a string, find largest substring with no repetition i.e all unique 
//characters. E.g ­ for string “abcdabceb” , answer will be “dabce” 

public class Q6 {
	
	public static void largeststring(String input) {
		
		 HashSet<Character> set = new HashSet<Character>();

	        String longestOverAll = "";
	        String longestTillNow = "";

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);

	            if (set.contains(c)) {
	                longestTillNow = "";
	                set.clear();
	            }
	            longestTillNow += c;
	            set.add(c);
	            if (longestTillNow.length() > longestOverAll.length()) {
	                longestOverAll = longestTillNow;
	            }
	        }
	        System.out.println(longestOverAll);
		
	}
	
	
	public static void main(String[] args) {
		String s = "abcdadbceb";
		largeststring(s);
			
		
	}
	
	

}
