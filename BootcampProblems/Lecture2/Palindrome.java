package Lecture2;

public class Palindrome {
	
	public static void main(String[] args) {
		String str = "abcsba";
		
		str = str.toLowerCase();
		
			int start = 0;
			int end = str.length()-1;
			while(start <= end )
			{
				if(str.charAt(start) == str.charAt(end))
				{
					start++;
					end--;
				}
			}
			
			if(start > end)
			{
				System.out.println("palindrome");
			}

	
	}

}
