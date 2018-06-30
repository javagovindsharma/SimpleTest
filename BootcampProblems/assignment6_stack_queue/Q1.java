package BootcampProblems.assignment6_stack_queue;

import java.util.Stack;

//Implement a Queue using two stacks
//a. Make Enqueue efficient
//b. Make Dequeue efficient


class aqueueUsingStack<E>
{
	Stack<E> stack1 = new Stack<>();
	Stack<E> stack2 = new Stack<>();
	
	void enqueue(E item)
	{
		stack1.push(item);
	}
	
	E dequeue()
	{
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
}




class bqueueUsingStack<E>
{
	Stack<E> stack1 = new Stack<>();
	Stack<E> stack2 = new Stack<>();
	
	void enqueue(E item)
	{
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
		}

		stack1.push(item);
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
	}
	
	E dequeue()
	{
		return stack1.pop();
	}
	
}


public class Q1 {

	public static void main(String[] args) {
	
		aqueueUsingStack<Integer> queue = new aqueueUsingStack<>();
//		bqueueUsingStack<Integer> queue = new bqueueUsingStack();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		for (int i = 0 ; i < 5 ; i++)
			System.out.println(queue.dequeue());
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		for (int i = 0 ; i < 5 ; i++)
			System.out.println(queue.dequeue());
		
	}
	
}




