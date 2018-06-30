package BootcampProblems.assignment2_strings;

//Reverse String word wise. Eg “Welcome to Coding Blocks” reversed is – 
//“Blocks Coding to Welcome” 


public class Q2 {

	public static void reverse_words(String s){
		String [] s1 = s.split(" ");
		for (int i = s1.length-1 ; i>=0 ; i--) {
			System.out.print(s1[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		String s = "Welcome to coding blocks";
		reverse_words(s);
		
	}
}
