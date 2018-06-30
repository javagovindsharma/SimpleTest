package BootcampProblems.Lecture8;

import BootcampProblems.Lecture7.Node;
import BootcampProblems.Lecture7.linkedlist;

public class merge {
	
	public static Node<Integer> mergell(Node<Integer> head1, Node<Integer> head2)
	{
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		Node<Integer> head = null,tail = null;
		if(head1.data < head2.data){
			head = head1;
			tail = head1;
			head1 = head1.next;
		}
		else{
			head = head2;
			tail = head2;
			head2 = head2.next;
		}
		
		while(head1 != null && head2 != null){
		
			if(head1.data < head2.data){
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			}
			else{
				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}		
		}
		if(head1 != null){
			tail.next = head1;
		}
		if(head2 != null){
			tail.next = head2;
		}
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
		l1head = mergell(l1head,l2head);
		linkedlist.print(l1head);

	}

}
