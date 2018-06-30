package BootcampProblems.assignment4_recursion2;

public class Q3 {

	public static String getoption(char c) {
		if (c == '2'){
			return "abc";	
		}
		
		if (c == '3'){
			return "def";	
		}
		if (c == '4'){
			return "ghi";	
		}
		if (c == '7'){
			return "pqrs";	
		}
		return " ";
		
	}
	
	public static void printKeyboard(String num ,String ansSoFar) {
		if(num.length() == 0) {
			System.out.println(ansSoFar);
			return;
		}
		String options = getoption(num.charAt(0));
		for(int i = 0 ; i < options.length() ; i++) {
			printKeyboard(num.substring(1), ansSoFar + options.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		printKeyboard("237", "");
	}
	
}
