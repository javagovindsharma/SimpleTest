package assignment4;

//Suppose you have a string made up of only the letters 'a' and 'b'. Write a recursive
//function that checks if the string was generated using the following rules:
//a. the string begins with an 'a'
//b. each 'a' is followed by nothing or an 'a' or "bb"
//c. each "bb" is followed by nothing or an 'a'

public class Q4 {

	public static boolean check(String str)
	{
		if(str.length() == 0)
			return true;
		if(str.charAt(0) == 'a' && str.length() >= 1)
		{
			if(str.length() > 2 && str.charAt(1)== 'b' && str.charAt(1) == str.charAt(2) )
			{
				return true;
			}
			else if(str.charAt(1) == 'a')
				return true;
			else
				return false;
		}
		
		else if (str.charAt(0) == 'b'  && str.length() >= 1)
		{
			if(str.length() > 2 && str.charAt(1)== 'b' && str.charAt(2) =='a' )
			{
				return true;
			}

			else
				return false;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(check("aaabaa"));
	}
	
	
}
