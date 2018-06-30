package BootcampProblems.Lecture8;

import BootcampProblems.Lecture7.Node;

public class stackusinglinkedlist<T> {
	private Node<T> head;
	int size;
	public stackusinglinkedlist() {
		head = null;
		size = 0;
	}
	public int size(){
		return size;
		
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	
	public T top(){
		return head.data;
	}
	
	public void push(T data)
	{
//		this.data[++top] = data;
		Node<T> newNode = new Node<T>(data);
		if(head == null )
		{
			head = newNode;
			size++;
		}
		else
		{
			newNode.next = head;
			head = newNode;
			size++;
		}
				
	}
	

	public void pop() throws StackUnderflowException
	{
		if(isEmpty())
		{
			StackUnderflowException e = new StackUnderflowException();
			throw e;
		}
		
//		T temp = head.data;
		head = head.next;
		size--;
//		return temp;
	}
	
	
}
