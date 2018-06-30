package BootcampProblems.assignment7_BinaryTree;

import java.util.Scanner;

import BootcampProblems.Lecture8.queuelinkedlist;
import BootcampProblems.lecture10.BinaryTreeNode;

//Find LCA(Lowest Common Ancestor) of two elements in a Binary Tree. Read about LCA 
//if you are having doubts about the definition.  

public class Q4LCA {
	
	public static BinaryTreeNode<Integer> takeinput()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Root data :");
		int data = s.nextInt();
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		queuelinkedlist<BinaryTreeNode<Integer>> pendingNodes = new queuelinkedlist<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> currentNode = pendingNodes.dequeue();
			
			System.out.println("Enter left child data of " + currentNode.data);
			int leftdata = s.nextInt();
			if(leftdata !=-1){
				BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>(leftdata);
				pendingNodes.enqueue(leftchild);
				currentNode.left = leftchild;
			}
		
			System.out.println("Enter right child data of " + currentNode.data);
			int rightdata = s.nextInt();
			if(rightdata !=-1){
				BinaryTreeNode<Integer> rightchild = new BinaryTreeNode<Integer>(rightdata);
				pendingNodes.enqueue(rightchild);
				currentNode.right = rightchild;
			}	
		}
		s.close();
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return;
		String tobePrinted = root.data + ":";
		if(root.left!=null)
			tobePrinted +=  root.left.data +",";
		if(root.right != null)
			tobePrinted += root.right.data+",";
		
		System.out.println(tobePrinted);
		print(root.left);
		print(root.right);
		
				
	}

	public static BinaryTreeNode<Integer> findnode(BinaryTreeNode<Integer> root, int num)
	{
		if(root == null)
			return null;
		if(root.data == num) {
			return root;
		}
		BinaryTreeNode<Integer> node1 = findnode(root.left, num);
		if(node1!= null)
			return node1;
		return findnode(root.right, num);

	}
	
	public static BinaryTreeNode<Integer> LCA(BinaryTreeNode<Integer> root , int num1, int num2)
	{
		if(root.left == null && root.right == null)
			return null;
		
		if(findnode(root, num1) == null && findnode(root, num2) != null)
			return findnode(root,num2);
		if(findnode(root, num1) != null && findnode(root, num2) == null)
			return findnode(root,num1);
			
		if(root.left.data == num1 && root.right.data == num2
				|| root.left.data == num2 && root.right.data == num1)
			return root;
		if(root.left.data == num1 || root.left.data == num2)
			return root;
		if(root.right.data == num1 || root.right.data == num2)
			return root;	
		
		BinaryTreeNode<Integer> LCAleft = LCA(root.left, num1, num2);
		BinaryTreeNode<Integer> LCAright = LCA(root.right, num1, num2);
		
		if(LCAleft == null && LCAright == null)
			return null;
		else if(LCAleft != null && LCAright != null)
			return root;
		else 
		{
			if(LCAleft != null && LCAright == null)
				return LCAleft;
			else
				return LCAright;
		}
		
		
	}
	
//	Q8 Given a tree and a node of tree, print all nodes which are at distance k from the given 
//	node.   
	
	public static void printNode(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> node , int k)
	{		
		if(k == 0 && node != null )
		{	
			System.out.println(node.data);
			return;
		}
		
		if(node.left != null)
			printNode(root,node.left,k-1);
		if(node.right != null)
			printNode(root,node.right,k-1);		
	}
	
//	10 5 20 1 2 3 4 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeinput();
		print(root);
		System.out.println();
		
		BinaryTreeNode<Integer> LCANode = LCA(root, 1, 20);
		if(LCANode == null)
			System.out.println("no node");
		else
			System.out.println("LCA : "+LCANode.data);
		
		printNode(root, root, 1);
		
		
		
	}

}
