package BootcampProblems.assignment3_recursion1;

//Return all permutations of a string.

public class Q11 {
	public static void printstring(String[] string) {
		for(int i = 0 ; i< string.length ; i++)
			System.out.println(string[i]);
	}
	
	public static int permutation(int num) {
		if(num == 0 )
			return 1;
		return num * permutation(num-1);
	}
	
	public static String[] permutationOfString(String str ) {
		if(str.length() == 0)
		{
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallerOutput = permutationOfString(str.substring(1));
		String[] output = new String[str.length() * ((smallerOutput.length == 0)? 1 : smallerOutput.length)];
		int i = 0;
		for(String s : smallerOutput) {
			for(int j = 0 ; j <= s.length() ; j++) {
				output[i] = s.substring(0, j) + str.charAt(0) + s.substring(j, s.length());
				i++;
			}
		}
		return output;
	}


	public static void main(String[] args) {
		printstring(permutationOfString("abc"));
//		System.out.println(permutation(5));
//		permutation("abc");
	}
	


}
