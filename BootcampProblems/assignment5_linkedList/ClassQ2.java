package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;

//Given two sorted linked lists merge them into
//a sorted linked list

public class ClassQ2 {
	
	public static Node<Integer> merge(Node<Integer> l1head, Node<Integer> l2head)
	{
		Node<Integer> ptr1 = l1head;
		Node<Integer> ptr2 = l2head;
		Node<Integer> head = null, tail = null;
		
		while(ptr1 != null && ptr2 != null)
		{
			if(ptr1.data < ptr2.data && head == null)
			{
				head = ptr1;
				tail = ptr1;
				ptr1 = ptr1.next;
				
			}
			if(ptr1.data > ptr2.data && head == null)
			{
				head = ptr2;
				tail = ptr2;
				ptr2 = ptr2.next;
			}
			
			if(ptr1.data > ptr2.data && head != null)
			{
				tail.next = ptr2;
				tail = ptr2;
				ptr2 = ptr2.next;
			}
			if(ptr1.data < ptr2.data && head != null)
			{
				tail.next = ptr1;
				tail = ptr1;
				ptr1 = ptr1.next;
			}
			
		}

		while(ptr1 != null)
		{
			tail.next = ptr1;
			ptr1 = ptr1.next;
		}
		while(ptr2 != null)
		{
			tail.next = ptr2;
			ptr2 = ptr2.next;
		}
		linkedlist.print(head);
		return head;
	}
	
//	5 6 7 8
//	1 2 3 4 10 

	public static void main(String[] args) {
		Node<Integer> l1head = linkedlist.takeinput();
		linkedlist.print(l1head);
		System.out.println();
		Node<Integer> l2head = linkedlist.takeinput();
		linkedlist.print(l2head);
		System.out.println();
		l1head = merge(l1head,l2head);
//		linkedlist.print(l1head);

	}

}
