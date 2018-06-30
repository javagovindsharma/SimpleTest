package BootcampProblems.assignment6_stack_queue;

import BootcampProblems.Lecture8.queuelinkedlist;

//Implement a Stack using two queues
//a. Make push efficient
//b. Make pop efficient

class aStackUsingQueue<E>
{
	queuelinkedlist<E> queue1 = new queuelinkedlist<>();
	queuelinkedlist<E> queue2 = new queuelinkedlist<>();
	
	void push(E data)
	{
		queue1.enqueue(data);
	}
	
	E pop()
	{
		int temp = 0;
		while(!queue1.isEmpty())
		{
			temp++;
			queue2.enqueue(queue1.dequeue());
		}
		while(temp != 1)
		{
			queue1.enqueue(queue2.dequeue());
			temp--;
		}
		return queue2.dequeue();
	}
}

class bStackUsingQueue<E>
{
	queuelinkedlist<E> queue1 = new queuelinkedlist<>();
	queuelinkedlist<E> queue2 = new queuelinkedlist<>();
	
	void push(E data)
	{
		queue2.enqueue(data);
		while(!queue1.isEmpty())
			queue2.enqueue(queue1.dequeue());
		
		queuelinkedlist<E> temp = new queuelinkedlist<E>();
		temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		
	}

	E pop()
	{
		return queue1.dequeue();
	}

}

public class Q2 {
	 
	public static void main(String[] args) {
		bStackUsingQueue<Integer> stack = new bStackUsingQueue<>();
		for(int i = 1 ; i <= 5 ; i++)
			stack.push(i);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}


