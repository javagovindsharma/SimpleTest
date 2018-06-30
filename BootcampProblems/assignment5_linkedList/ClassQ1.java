package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;


public class ClassQ1 {

	// Find 5th element from end without
	//calculating length of Linked List 
	
	public static void find5thelement(Node<Integer> head){
		Node<Integer> temp = head;
		for(int i = 0 ; i < 5 ; i++)
		{	
			temp= temp.next;		
		}
		while(temp != null)
		{
			temp = temp.next;
			head = head.next;
		}
		System.out.println("data "+ head.data);
		
	}
	
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
		System.out.println();
		find5thelement(head);
	}
	
}
