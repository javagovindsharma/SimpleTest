package BootcampProblems.lecture10;

import java.util.Scanner;

import BootcampProblems.Lecture8.queuelinkedlist;


public class BinaryTreeUse {

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
		return root;
	}
	
	
	public static BinaryTreeNode<Integer> mirrorImage(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return null;
		if(root.left == null && root.right == null)
			return root;
		
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorImage(root.left);
		mirrorImage(root.right);
			
		
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
	
	public static int  height(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int leftHeight,rightheight ;
		leftHeight = height(root.left);
		rightheight = height(root.right);
		if(leftHeight > rightheight)
			return leftHeight + 1;
		else
			return rightheight + 1;
	}
	
	
	public static BinaryTreeNode<Integer> findnode(BinaryTreeNode<Integer> root, int num)
	{
		if(root == null)
			return null;
		
		if(root.data == num)
		{
			return root;
		}
		BinaryTreeNode<Integer> node1 = findnode(root.left, num);
		if(node1!= null)
			return node1;
		return findnode(root.right, num);

	}
	
	public static int diameteroftree(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return 0;
		int leftDiameter  = diameteroftree(root.left);
		int rightDiameter = diameteroftree(root.right);
		int heightsum = height(root.left)+ height(root.right) +1;
		
		return Math.max(Math.max(leftDiameter, rightDiameter),heightsum);
		
		
		
	}
	public static DiameterReturnType diameter(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			DiameterReturnType ans = new DiameterReturnType();
			ans.height = 0 ;
			ans.diameter = 0 ;
			return ans;
			
		}
		DiameterReturnType leftans  = diameter(root.left);
		DiameterReturnType rightans = diameter(root.right);
		
		int heightsum = leftans.height + rightans.height + 1;
		
		DiameterReturnType ans = new DiameterReturnType();
		ans.diameter = Math.max(heightsum, Math.max(leftans.diameter, rightans.diameter));
		ans.height = Math.max(leftans.height, rightans.height) +1;
		return ans;
		
		
	}
		

//	10 5 20 1 2 3 4 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeinput();
		print(root);
		System.out.println();
		//mirror
		System.out.println("mirror Image");
		BinaryTreeNode<Integer> mirrorRoot = mirrorImage(root);
		print(mirrorRoot);
		System.out.println();
		
		//height
//		System.out.println("Height " + height(root));
		
		//find a node
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter Node data to find :");
//		int num = s.nextInt();
//		BinaryTreeNode<Integer> node = findnode(mirrorRoot, num);
//		if(node!= null)
//			System.out.println(node.data + " node found in tree");
//		else
//			System.out.println("Node not found");

		
		// diameter of tree 
		
		System.out.println("Diameter of tree : " + diameteroftree(root));
		System.err.println("Diameter : " + diameter(root).diameter);
		
	}
	
	
	// Buildinh tree using preorder and inorder traversal -- given arrays for both traversals
	
}
