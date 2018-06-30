package BootcampProblems.Lecture8;

import BootcampProblems.Lecture7.Node;

public class queuelinkedlist<T> {

	private Node<T> head;
	private Node<T> tail;
	int size;
	
	public queuelinkedlist() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public int size(){
		return size;	
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public void enqueue(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			size++;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			size++;
		}
				
	}
	
	public T dequeue() 
	{
		if(isEmpty())
		{
			// exception
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
}
