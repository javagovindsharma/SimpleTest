package BootcampProblems.lecture10;

import java.util.ArrayList;

import BootcampProblems.assignment5_linkedList.Node;
import BootcampProblems.lecture11.BSTreturnType;
import BootcampProblems.Lecture7.linkedlist;

public class BST {
		
	public static BinaryTreeNode<Integer> findnode(BinaryTreeNode<Integer> root ,int num)
	{
		if(root == null)
			return null;
		if(root.data == num)
			return root;
		if(num > root.data)
		{	
			BinaryTreeNode<Integer> node1 = findnode(root.right, num);
			if(node1 != null)
				return node1;
		}
	
			
		return findnode(root.left, num);
	}

	
	public static void print(BinaryTreeNode<Integer> root, int k1, int k2)
	{
		if(root== null)
			return;
		if(k1 < k2)
		{
			if(root.data > k1 && root.data < k2)
				System.out.println(root.data);
			
		}
		else if (k1 >k2)
		{
			if(root.data < k1 && root.data >k2)
				System.out.println(root.data);
		}
			
		print(root.left, k1, k2);
		print(root.right, k1, k2);
		
		
	}
	
	
	public static boolean checkBST(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return true;
//		boolean flagleft =  false, flagright = false;
	
		if(checkBST(root.left)&& checkBST(root.right))
		{
			int leftmax = findMax(root.left);
			int rightmin = findMin(root.right);
			if(leftmax < root.data && rightmin > root.data)
				return true;
			else 
				return false;
		
		}
		return false;
	}
	
//	public static BSTreturnType isBST(BinaryTreeNode<Integer> root) 
//	{
//		if(root ==  null)
//			return true;
//		
//		
//		BSTreturnType leftAns = checkBST(root.left);
//		BSTreturnType rightAns = checkBST(root.right);
//		
//		
//		if(leftAns)
//	}
	
	public static ArrayList<BinaryTreeNode<Integer>> findPath(BinaryTreeNode<Integer> root, int num)
	{
		if(root == null)
			return null;
		ArrayList<BinaryTreeNode<Integer>> pathlist = new ArrayList<>();
		while(root != null && root.data != num)
		{
			while(root != null && root.data > num)
			{
				pathlist.add(root);
				root = root.left;
			}
			while(root != null && root.data < num)
			{
				pathlist.add(root);
				root = root.right;
			}
		}
		if(root != null && root.data == num)
		{	
			pathlist.add(root);
			return pathlist;	
		}
		return null;
	}
	
	public static int findMax(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return Integer.MIN_VALUE;
		return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
	}
	
	public static int findMin(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return Integer.MAX_VALUE;
		return Math.min(root.data, Math.min(findMin(root.left), findMin(root.right)));

		
	}
	
	public static Node<Integer> convertbstintolinkedl(BinaryTreeNode<Integer> root)
	{
		if(root == null )
			return null;
	
		Node<Integer> newnode = new Node<Integer>(root.data);		
		Node<Integer> left = convertbstintolinkedl(root.left);
		Node<Integer> right = convertbstintolinkedl(root.right);
		Node<Integer> head = null;
		if(left != null)
		{
			head = left;
			Node<Integer> temp = left;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newnode;
		}
		else
		{
			head = newnode;
		}
		newnode.next = right;
		return head;

	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
	
	
	// 10 5 20 1 6 15 25 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeinput();
		BinaryTreeUse.print(root);
		BinaryTreeNode<Integer> node = findnode(root, 1);
		if(node != null)
			System.out.println("node : "+node.data+" found in tree");
		else
			System.out.println("Node not found");
		
		System.out.println("print between k1 and k2");
		print(root, 1, 12);
		
//		System.out.println("check bst :" + checkBST(root));
		System.out.println("max  :"  + findMax(root.left));
		System.out.println("min : " + findMin(root.right));
		System.out.println("isBST :" + checkBST(root));
		System.out.println("Path to a node from root ");
		ArrayList<BinaryTreeNode<Integer>> list = findPath(root, 15);
		if(list == null)
		{	
			System.out.println("No path");
		}
		else
		{
			for(int i = 0 ; i < list.size() ; i++)
			{
				System.out.print(list.get(i).data + "->");
			}

		}
		System.out.println();
		System.out.println("list ");
		Node<Integer> head = convertbstintolinkedl(root);
		print(head);
	}
	

}
