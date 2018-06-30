package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;


//13. Append the last n elements of a linked list to the front.
//e.g. for 1→ 2→ 3 → 4 → 5 → 6→ null and n = 2 return 5→ 6→ 1→ 2→ 3 → 4 → null


public class Q13 {
	
	public static Node<Integer> appendNelement(Node<Integer> head, int n) {
		
		int length = linkedlist.length(head);
		int pos = length - n ;
		int startpos = 0;
		Node<Integer> temp = head,tail = temp,prev = null;
		
		while(startpos != pos && temp.next != null)
		{
			prev = temp;
			temp = temp.next;
			tail = tail.next;
			startpos++;
		}		
		while(tail.next != null)
		{
			tail = tail.next;
		}
		
		prev.next = null;
		tail.next = head;
		head = temp;
		return head;
		
	}
	
	
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
		System.out.println();
		head = appendNelement(head, 2);
		linkedlist.print(head);
	}
}
