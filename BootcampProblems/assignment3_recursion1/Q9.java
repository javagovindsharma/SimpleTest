package BootcampProblems.assignment3_recursion1;

//Given two Strings check if one is reverse of the other.

public class Q9 {

	public static boolean checkreverse(String str1, String str2) {
//		aaabbb  bbbaaa
		if(str1.length() == 0 && str2.length() ==0)
			return true;
		else if (str1.length()!= str2.length())
			return false;
		boolean reverse = checkreverse(str1.substring(1), str2.substring(0, str2.length()-1));
		if(reverse)
		{
			if(str1.charAt(0) == str2.charAt(str2.length()-1)) {
				return true;
			}
			else if(str1.charAt(0) != str2.charAt(str2.length()-1)) {
				return false;	
			}
		}
		return reverse;
	}
	public static void main(String[] args) {
		System.out.println(checkreverse("abaa","aaa" ));
	}
	
	
}
