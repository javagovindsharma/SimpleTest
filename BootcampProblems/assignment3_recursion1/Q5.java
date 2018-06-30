package BootcampProblems.assignment3_recursion1;

//Given a string, compute recursively (no loops) a new string where all appearances of
//"pi" have been replaced by "3.14".
//changePi("xpix") → "x3.14x"
//changePi("pipi") → "3.143.14"
//changePi("pip") → "3.14p"

public class Q5 {
	public static void changePi(String str)
	{
		if(str.length() < 2) {
			System.out.print(str);
			return;	
		}if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			System.out.print("3.14");
			changePi(str.substring(2));
		} else {
			System.out.print(str.charAt(0));
			changePi(str.substring(1));	
		}
	}
	
	
	public static void main(String[] args) {
//		System.out.println(changePi("pipi"));
		changePi("ppippipi");
	}
}
