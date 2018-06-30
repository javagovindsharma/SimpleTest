package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;

public class reversell {

	public static Node<Integer> reverse(Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> prev = null;
		Node<Integer> next = head.next;
		int counter  = 0;
		
		while(temp != null && next != null && next.next != null)
		{
			counter++ ;
			temp.next = prev;
			prev = next.next;
			next.next = temp;
			temp = prev;
			prev = next;
			next = temp.next;
		}
		temp.next = prev;
		if(next != null)
		{
			next.next = temp;
			head = next;
		}
		else 
			head = temp;
		System.out.println("counter : "+ counter);
		return head;
	
	}
	
	
	
	
	
	
	

	public static Node<Integer> reverserecursion(Node<Integer> head ,Node<Integer> prev) {
		Node<Integer> current = head;
		if(current.next == null) {
			head = current;
			current.next = prev;
		}
		Node<Integer> next = current.next;
		current.next = prev;
		reverserecursion(next, current);
		return head;
	}
	

	
	
	public static Node<Integer> reverseg(Node<Integer> node) {
        Node<Integer> prev = null;
        Node<Integer> current = node;
        Node<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
		head = reverserecursion(head,null);
		System.out.println("reverse");
		linkedlist.print(head);
		
	}
}
