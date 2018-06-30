package BootcampProblems.assignment6_stack_queue;

import BootcampProblems.Lecture8.StackUnderflowException;
import BootcampProblems.Lecture8.stackusingarray;

//
//Implement a class MinStack using the stack class we have already built. It should
//support O(1) push, O(1) pop and O(1) getMinimum() functions where getMinimum()
//returns the minimum element present in the stack. (Hint: You would need two stacks for
//doing this)

public class MinStack {
	
	stackusingarray stack1 = new stackusingarray(8);
	stackusingarray stackMin = new stackusingarray(8);
	
	public void push(int data) {
		stack1.push(data);
		if(stackMin.isEmpty())
		{
			stackMin.push(data);
		}
		if(stackMin.gettop() > data)
		{	
			stackMin.push(data);
		
		}if(stackMin.gettop() < data)
			stackMin.push(stackMin.gettop());
		
	}
	
	public int pop() throws StackUnderflowException
	{
		stackMin.pop();
		return stack1.pop();
	
	}

	public int getMin() throws StackUnderflowException
	{
			
		return stackMin.gettop();
		
	}
	
	public static void main(String[] args) throws StackUnderflowException {
		MinStack s = new MinStack();
		s.push(15);
		s.push(11);
		s.push(5);
		s.push(2);
		s.push(12);
		s.push(50);
		s.push(1);
		s.push(10);
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.getMin());
		
	}
	
}
