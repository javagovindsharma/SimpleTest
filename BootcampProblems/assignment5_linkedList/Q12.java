package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;


//2. Print a given linked list in reverse order. Tail first. You can’t change any pointer in the linked
//   list.

public class Q12 {

	public static void printreverse(Node<Integer> head) {
		
		if(head.next == null) {
			System.out.print(head.data + "->");
			return;
		}
		printreverse(head.next);
		System.out.print(head.data+"->");
		return;
		
		
	}
	
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
		System.out.println();
		printreverse(head);
		
	}
	
	
	
}
