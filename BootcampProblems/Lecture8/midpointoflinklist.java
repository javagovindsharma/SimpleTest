package BootcampProblems.Lecture8;

import BootcampProblems.Lecture7.Node;
import BootcampProblems.Lecture7.linkedlist;

public class midpointoflinklist {

	public static Node<Integer> midpoint(Node<Integer> head)
	{
		Node<Integer> slowptr = head , fastptr = head;
		if(head == null || head.next ==null)
			return head;
		
		while(fastptr.next != null && fastptr.next.next !=null)
		{
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			
		}
		return slowptr;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		Node<Integer> midnode = midpoint(head);
	}
	
}
