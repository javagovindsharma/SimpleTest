package BootcampProblems.assignment2_strings;

//Reverse  each word of a String. Eg “Welcome to Coding Blocks” reversed is – 
//“emocleW gnidoC ot skcolB"

public class Q1 {
	
	public static void reverse_words(String s){
		String [] s1 = s.split(" ");
		for (String string : s1) {
			for(int i = string.length()-1 ;i >= 0; i-- )
				System.out.print(string.charAt(i));
			System.out.print(" ");
		}
		
	}
	public static void main(String[] args) {
		String s = "Welcome to coding blocks";
		reverse_words(s);
		
	}
}
