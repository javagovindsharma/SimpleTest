package BootcampProblems.Lecture8;

public class stackuse {

	public static void main(String[] args) throws StackUnderflowException {
//		stackusingarray stack = new stackusingarray(5);
//		for(int i = 0 ; i < 5 ; i++)
//			stack.push(i);
//		
//		System.out.println("size : " + stack.size());
//		while(!stack.isEmpty())
//		{
//			System.out.println(stack.pop());
//		}
		
		stackusinglinkedlist<Integer> stack = new stackusinglinkedlist<>();
		for(int i = 1 ; i <= 5 ; i++)
			stack.push(i);
		System.out.println("size : " + stack.size());
		while(!stack.isEmpty())
		{
//			System.out.println(stack.pop());
		}

	}
}
