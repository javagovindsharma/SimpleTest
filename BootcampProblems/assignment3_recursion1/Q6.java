package BootcampProblems.assignment3_recursion1;

//Given a string, compute recursively a new string where all the 'x' chars have been
//removed.
//noX("xaxb") → "ab"
//noX("abc") → "abc"
//noX("xx") → ""

public class Q6 {
	
	public static String removeX(String str) {
		if(str.length() == 0)
			return str;
		if(str.charAt(0) == 'x')
			return removeX(str.substring(1));
		return str.charAt(0) + removeX(str.substring(1));
	}
	public static void main(String[] args) {
		System.out.println(removeX("xaxbxcx"));
	}

}
