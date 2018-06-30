package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;


//Implement Bubble Sort, Selection Sort, Insertion Sort and Merge Sort using recursion.

public class Q7 {

	
	public static Node<Integer> Bubblesort(Node<Integer> head) {
		
		if(head.next == null)
			return head;
		head.next = Bubblesort(head.next);
		Node<Integer> temphead = head;
		while(temphead.next != null)
		{
			if(temphead.data > temphead.next.data)
			{

				Node<Integer> temp = temphead.next;
				temphead.next = temp.next;
				temp.next = temphead;
				temphead = temp;
				
			}
			temphead = temphead.next;
		}

		return head;
		
	}
	
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
		head = Bubblesort(head);
		System.out.println("after sorting");
		linkedlist.print(head);
	
	}
}

