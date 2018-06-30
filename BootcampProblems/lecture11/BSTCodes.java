package BootcampProblems.lecture11;

import java.awt.print.Printable;
import java.util.Scanner;
import java.util.Stack;

import BootcampProblems.assignment5_linkedList.Node;
import BootcampProblems.lecture10.BST;
import BootcampProblems.lecture10.BinaryTreeNode;
import BootcampProblems.lecture10.BinaryTreeUse;

public class BSTCodes {
	
	
	public static BinaryTreeNode<Integer> buildaBSTUsingSortedArray(int[] arr, int s, int e)
	{
		if(s > e)
			return null;
		int mid = (s+e)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left = buildaBSTUsingSortedArray(arr, s, mid-1);
		root.right = buildaBSTUsingSortedArray(arr,mid+1,e);
		return root;
	}
	
	public static BinaryTreeNode<Integer> insertNode(BinaryTreeNode<Integer> root, int data)
	{
		return root;
	}

	
	public static BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> root, int data)
	{
		if(root == null)
			return root;
		
		BinaryTreeNode<Integer> temp = root , prev = null;
		while(temp.data != data && temp != null)
		{
			prev = temp;
			if(data > temp.data)
			{
				temp = temp.right;
			}
			if(data < temp.data)
			{
				temp = temp.left;
			}
		}
		if(temp.data == data)
		{
			if(temp.left == null && temp.right == null)
			{
				if(temp == prev.left)
					prev.left = null;
				else
					prev.right = null;
			}
			
			if(temp.left != null && temp.right == null)
			{
				if(temp == prev.left)
					prev.left = temp.left;
				else
					prev.right = temp.left;
				
			}
			
			if(temp.right != null && temp.left == null)
			{
				if(temp == prev.left)
					prev.left = temp.right;
				else
					prev.right = temp.right;
			}
			
			else if (temp.right != null && temp.left != null)
			{
				BinaryTreeNode<Integer> sucessor = temp.right, prevSuccesor = null;
				if(sucessor.left == null)
				{
					int temp1 = temp.data;
					temp.data = sucessor.right.data;
					sucessor.data = temp1;
					deleteNode(sucessor, data);
					
				}
				else
				{
					while(sucessor.left != null)
					{
						prevSuccesor = sucessor;
						sucessor = sucessor.left;
					}
					System.out.println("sucessor"+sucessor.data);
					temp.data = sucessor.data;
					prevSuccesor.left = null;
					
				}
			}
			
			
			
		}
		else
			System.out.println("Node not found");
		
		return root;
	}
	
	public static void inorder(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + "->");
		inorder(root.right);
	}
	
	public static void inorderIter(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			System.out.println("No node in the tree");
			return;		
		}
		
		Stack<BinaryTreeNode<Integer>> stack1 = new Stack<>();
		stack1.push(root);
		BinaryTreeNode<Integer> temp = stack1.peek();
		while(temp.left != null)
		{
			stack1.push(temp.left);
			temp = temp.left;
		}
		while(!stack1.isEmpty())
		{
			BinaryTreeNode<Integer> node = stack1.pop();
			System.out.print(node.data + "->");
			if(node.right != null)
			{
				stack1.push(node.right);
				while(node.left != null)
				{
					stack1.push(node.left);
					node = node.left;
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		BinaryTreeNode<Integer> root = buildaBSTUsingSortedArray(arr,0,arr.length-1);
		BinaryTreeUse.print(root);
		inorder(root);
		System.out.println("Iterative");
		inorderIter(root);
		
//		System.out.println("Enter data to delete");
//		Scanner s = new Scanner(System.in);
//		int data = s.nextInt();
//		root = deleteNode(root, data);
//		BinaryTreeUse.print(root);

	}
}
