package BootcampProblems.assignment6_stack_queue;

import BootcampProblems.Lecture8.queuelinkedlist;

//Reverse a Queue using recursion

public class Q3 {
	
	public static void reverseQueue(queuelinkedlist<Integer> queue)
	{
		if(queue.isEmpty())
			return;
		int temp = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(temp);
	}
	
	public static void main(String[] args) {
		queuelinkedlist<Integer> q = new queuelinkedlist<>();
		for(int i = 1 ; i <= 5 ; i++)
		{
			q.enqueue(i);
		}
		reverseQueue(q);
		
		for(int i = 1 ; i <= 5 ; i++)
			System.out.println(q.dequeue());
		
		
	}
}
