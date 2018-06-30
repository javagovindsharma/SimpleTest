package BootcampProblems.assignment2_strings;

//Take a String input from user and print the String without printing the 
//consecutive duplicates For example, for input "aabccba" print "abcba"  


public class Q4 {
	public static void printstring(String s) {
		for(int i=1 ; i < s.length() ; i++ )
		{

			while(s.charAt(i-1) == s.charAt(i) && i < s.length()-2)
			{
				i++;
			}	
			if(s.charAt(i-1)!= s.charAt(i) && i < s.length()-1)
				System.out.print(s.charAt(i-1));
			else if(i == s.length()-1)
				System.out.println(s.charAt(i));
			else
				System.out.print(s.charAt(i));
			
		}

	}
	
	
	public static void main(String[] args) {
		String s = "bbaaabccbcccaaaabba";
		printstring(s);
			
		
	}

}
