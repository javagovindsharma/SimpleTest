package BootcampProblems.Lecture8;

import BootcampProblems.Lecture7.Node;
import BootcampProblems.Lecture7.linkedlist;

public class mergesort {
	
	public static Node<Integer> mergesortll(Node<Integer> head)
	{
		if(head == null || head.next == null)
			return head;
		
		Node<Integer> mid = midpointoflinklist.midpoint(head);
		Node<Integer> part1 = head;
		Node<Integer> part2 = mid.next;
		mid.next = null;
		part1 = mergesortll(part1);
		part2 = mergesortll(part2);
		head = merge.mergell(part1, part2);
		return head;
	}
	public static void main(String[] args) {
		Node<Integer> head = linkedlist.takeinput();
		head = mergesortll(head);
		linkedlist.print(head);
	}

}
