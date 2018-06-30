package BootcampProblems.assignment3_recursion1;

//Use recursion to check if a given String is palindrome or not.
// aababaa 3

public class Q4 {
	public static boolean checkpalindrome(String str) {
		if (str.length() == 1)
			return true;
		Boolean palindrome = checkpalindrome(str.substring(1, str.length()-1));
		if(palindrome  == true && str.charAt(0)== str.charAt(str.length()-1))
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(checkpalindrome("abcba"));
	}
}
