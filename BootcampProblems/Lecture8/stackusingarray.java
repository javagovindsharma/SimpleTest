package BootcampProblems.Lecture8;

public class stackusingarray {
	
	private int[] data;
	int top;
	
	public stackusingarray(int size) {
		this.data = new int[size]; 
		top = -1;
	}

	public int size(){
		return top+1;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public int gettop()
	{
		return data[top];
	}
	
	public void push(int data)
	{
		if(size() ==  this.data.length)
		{
			//stackoverflow exception
		}
		this.data[++top] = data;
	}
	
	public int pop() throws StackUnderflowException
	{
		if(isEmpty())
		{
			StackUnderflowException e = new StackUnderflowException();
			throw e;
		}
		
		int temp = data[top];
		top-- ;
		return temp;
	}
}

