package BootcampProblems.Lecture8;

public class reverseStack {

	public static void reverse(stackusingarray stack, stackusingarray helperstack) throws StackUnderflowException{
		
		if(stack.size() == 0 || stack.size() == 1)
		{
			return;
		}
		
		int temp = stack.pop();
		
		reverse(stack, helperstack);
		while(!stack.isEmpty())
		{
			helperstack.push(stack.pop());
		}
		
		stack.push(temp);
		while(!helperstack.isEmpty())
			stack.push(helperstack.pop());
		
		
	}
	
	public static void main(String[] args) {
//		stackusingarray stack = new stackusingarray(5);
	}
}
