package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;


//14. Implement kReverse(int k) i.e. you reverse first K elements then reverse next K elements
//and join the linked list and so on.
//3 → 4 → 5 → 2 → 6 → 1 → 9 for kreverse(3) becomes 5 → 4 → 3 → 1 → 6 → 2 → 9 → 1


public class Q14 {

	public static Node<Integer> kReverse(Node<Integer> head,  int k ) {
		
		if(head.next == null)
		{
			return head;
		}		
		if(linkedlist.length(head) < k)
		{
			head = reversell.reverse(head);
			return head;
			
		}
		int pos = 0 ;
		Node<Integer> temp = head,nexthead = null,prev= null;
		while(pos != k)
		{
			prev = temp;
			temp= temp.next;
			pos++;
		}
		nexthead = prev.next;
		prev.next = null;
		temp = head;
		head = reversell.reverse(temp);
		temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = kReverse(nexthead, k);
		
		return head;
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
		
		System.out.println();
		head = kReverse(head, 3 );
		linkedlist.print(head);
		
	}
}
