package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;


//Eliminate duplicates from a sorted linked list

public class Q4 {

	public static Node<Integer> elminateduplicates(Node<Integer> head) {
		if(head.next == null )
			return head;

		Node<Integer> temp = elminateduplicates(head.next);
		
		if(head.data == temp.data)
		{
			head.next = temp.next;
			temp.next = null;
			return head;
		}
		else
		{
			head.next = temp;
		}
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
		head = elminateduplicates(head);
		System.out.println("after");
		linkedlist.print(head);
		
	}
}
