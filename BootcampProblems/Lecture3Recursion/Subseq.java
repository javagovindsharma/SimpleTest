package Lecture3Recursion;

public class Subseq {
	
	public static void printstring(String[] string)
	{
		for(int i = 0 ; i< string.length ; i++)
			System.out.println(string[i]);
	}

	public static String[] subsequence(String input)
	{
		if(input.length() == 0)
		{
			String[] output = {" "};
			return output;
		}
		String[] smallerouput = subsequence(input.substring(1));
		String[] output = new String[2 * smallerouput.length];
		for(int i = 0 ; i < smallerouput.length ; i++)
			output[i] = smallerouput[i];
		for(int i = 0  ; i < smallerouput.length ; i++)
			output[i + smallerouput.length] = input.charAt(0) + smallerouput[i];
		return output;	
	}
	
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
	
	public static String[] keypadcombination(String input) {
		if(input.length() == 0) {
			String[] output = new String[1];
			output[0] = " ";
			return output;
		}
		String[] smallerouput = keypadcombination(input.substring(1));
		String option = getoption(input.charAt(0));
		String[] output = new String[option.length() *smallerouput.length];
		int index = 0;
		for(int i = 0 ; i < option.length() ; i++) {
			for(int j = 0 ; j < smallerouput.length ; j++) {
				output[index] = option.charAt(i) + smallerouput[j];
				index++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
//		String a = "abh";
		printstring(subsequence("abc"));
//		printstring(keypadcombination("23"));
	}
}
