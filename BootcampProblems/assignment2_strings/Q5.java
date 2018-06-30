package BootcampProblems.assignment2_strings;

//Write code to do basic string compression. e.g. Given aaabbccds print out 
//a3b2c2ds. 

public class Q5 {

	public static void compress(String s) {
		for(int i=0 ; i < s.length() ; i++ )
		{
			char temp = s.charAt(i);
			int counter = 0;
			while(s.charAt(i)== temp && i < s.length()-1)
			{
				counter++;
				if(s.charAt(i+1)!= temp)
					break;
				i++;
			}
			System.out.print(temp);
			if(counter > 1 )
				System.out.print(counter);
		}

	}
	
	
	public static void main(String[] args) {
		String s = "aaabbccds";
		compress(s);
			
		
	}
	
}
