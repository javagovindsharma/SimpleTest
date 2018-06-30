package BootcampProblems.Lecture8;

public class checkparenthesis {

	public static void checkbalance(String str) 
	{
		stackusinglinkedlist<Character> stack = new stackusinglinkedlist<>();
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i) == '{' || str.charAt(i)== '[' || str.charAt(i) == '(')
			{
				stack.push(str.charAt(i));
			}
			else if((str.charAt(i) == '}' && stack.top() == '{' ))
			{
				try
				{	
					stack.pop();			
				} 
				catch(StackUnderflowException e)
				{
					System.out.println("unbalanced");
					return;
				}
			}
			
			else if((str.charAt(i) == ']' && stack.top() == '[' ))
			{
				try
				{	
					stack.pop();			
				} 
				catch(StackUnderflowException e)
				{
					System.out.println("unbalanced");
					return;
				}
			}
			else if((str.charAt(i) == ')' && stack.top() == '(' ))
			{
				try
				{	
					stack.pop();			
				} 
				catch(StackUnderflowException e)
				{
					System.out.println("unbalanced");
					return;
				}
			}
			
			else  
				continue;
			
		}
		
		
		if(stack.isEmpty())
			System.out.println("balanced");
		else
			System.out.println("unbalanced");
	}
	public static void main(String[] args)  {
		checkbalance("{[](({))}");
	}
	
}
