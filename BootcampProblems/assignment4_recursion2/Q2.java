package BootcampProblems.assignment4_recursion2;

import java.util.ArrayList;

//Given a String Return all the subsequences. e.g. for input = abc you need to print “”,
//a, b, c, ab, ac, bc, abc
//	a. Instead of returning print all these (make a print function, it will not return
//	anything and will just print all subsequences )
		
		
public class Q2 {
	
	public static void printstring(String[] string)
	{
		if(string.length == 0)
			System.out.println("");
		for(int i = 0 ; i< string.length ; i++)
			System.out.println(string[i]);
	}
	
	
	public static void printsubstrings(String str , String ansSoFar) {
		if(str.length()==0) {
            System.out.println(ansSoFar); 
            return;
        }
		printsubstrings(str.substring(1), ansSoFar + str.substring(0,1));
		printsubstrings(str.substring(1), ansSoFar);

	}	
	
	public static String[] returnsubseq(String str)
	{
		if(str.length() == 0) {
			String[] output = {""};
			return output;
		}
		String[] Smalleroutput = returnsubseq(str.substring(1));
		String[] output = new String[2* Smalleroutput.length];
		for(int i =0 ; i < Smalleroutput.length ; i++)
			output[i] =  Smalleroutput[i];
		for(int i =  0 ; i < Smalleroutput.length ; i++) {
			output[i + Smalleroutput.length] = str.charAt(0) + Smalleroutput[i]; 
		}
		return output;
	}
	public static int[] smallerarray(int[] a)
	{
		int smallerarray[] = new int[a.length-1];

		for(int i = 1 ; i < a.length ; i++)
		{
			smallerarray[i-1] = a[i];
		}
		return smallerarray;
	}
	
	public static ArrayList<int[]> subset(int[] arr)
	{
		if(arr.length == 0)
		{
			ArrayList<int[]> output = new ArrayList<>();
			output.add(null);
			return output;
		}
		
		ArrayList<int[]> Smalleroutput =  subset(smallerarray(arr));
		ArrayList<int[]> output = new ArrayList<>();
		for(int i =0 ; i < Smalleroutput.size() ; i++)
			output.add(Smalleroutput.get(i));
		return output;
	}
	
	
		
	public static void main(String[] args) {
//		printsubstrings("abc","");
//		subsequence("abc", "");
		printstring(returnsubseq("abc"));
	}	
		
		
}		
		