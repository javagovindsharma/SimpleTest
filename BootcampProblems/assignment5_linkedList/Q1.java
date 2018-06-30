package BootcampProblems.assignment5_linkedList;

import BootcampProblems.Lecture7.linkedlist;
import BootcampProblems.Lecture7.Node;

//Insert a node into Linked List at ith position recursively

public class Q1 {

	public static Node<Integer> insertrecur(Node<Integer> head ,int data, int pos)
	{
		if(pos == 0){
			Node<Integer> newNode = new Node<Integer>(data);
			newNode.next = head;
			return newNode;
		}
		head.next = insertrecur(head.next, data, pos-1);
		return head;
		
	}
	
	public static Node<Integer> deleterecur(Node<Integer> head , int pos)
	{
		if(pos == 0) {
			head = head.next;
			return head;
		}
		head.next = deleterecur(head.next, pos-1);
		return head;
	}
	
	
	public static void main(String[] args) {
		
		Node<Integer> head = linkedlist.takeinput();
		linkedlist.print(head);
//		Node<Integer> newnode = new Node<Integer>(25);
		insertrecur(head,30 ,3);
		System.out.println("insert");
		linkedlist.print(head);
		System.out.println("delete 2nd ");
		deleterecur(head, 2);
		linkedlist.print(head);

	}
	
}
