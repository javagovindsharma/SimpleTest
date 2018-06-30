package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;

//11. Arrange elements in a Linked List such that all even numbers are placed after odd numbers.


public class Q8 {

	public static Node<Integer> arrange(Node<Integer> head)
	{
		Node<Integer> tail = null,last = null,temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		tail = temp;
		temp= head;
		last = tail;
		Node<Integer> oddhead =null,prev = null;
		while(temp.data % 2 == 0)
		{
			temp = temp.next;
		}
	
		oddhead = temp;
		temp = head;
				
		while(temp.next != null && temp != last)
		{
			if(temp == oddhead)
			{
				prev = temp;
				temp = temp.next;
			}
			else if(temp.data % 2 == 0)
			{
				Node<Integer> node = temp;
				prev.next = node.next;
				temp = temp.next;
				node.next = null;
				tail.next = node;
				tail = node;
			}
			else
			{
				prev = temp; 
				temp = temp.next;
			}
			
			
		}
		return oddhead;
		
	}
	
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
		head = arrange(head);
		System.out.println("after");
		linkedlist.print(head);
		
		
	}
}
