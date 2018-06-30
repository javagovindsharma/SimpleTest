package BootcampProblems.assignment3_recursion1;

//Write a recursive function to convert a String into the number it represents. e.g. for
//input “1231” you should return integer 1231.

public class Q7 {	
	public static int convertstringTonum(String str) {
		if(str.length() == 0)
			return 0 ;
		return (int) (Character.getNumericValue(str.charAt(0)) * Math.pow(10, str.length()-1) 
				+ convertstringTonum(str.substring(1)));
	}

	public static void main(String[] args) {
		System.out.println(convertstringTonum("1234"));
	}

}
