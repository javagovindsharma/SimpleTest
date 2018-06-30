package BootcampProblems.Lecture9;

import java.util.Scanner;

import BootcampProblems.Lecture8.queuelinkedlist;

public class TreeUSe {

	public static TreeNode<Integer> takeinput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter data :");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		System.out.println("Enter the no of children of " + data);
		int numchild = s.nextInt();
		for(int i = 0 ; i < numchild ; i++)
		{
			TreeNode<Integer> currentchild = takeinput();
			root.children.add(currentchild);
		}
		return root;
	}

	public static TreeNode<Integer> takeinputLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter data :");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		queuelinkedlist<TreeNode<Integer>> pendingNode = new queuelinkedlist<>();
		pendingNode.enqueue(root);
		
		while(!pendingNode.isEmpty())
		{
			TreeNode<Integer> currentNode = pendingNode.dequeue();
			System.out.println("Enter the no of children of " + currentNode.data);
			int numchild = s.nextInt();
			for(int i = 0 ; i <  numchild ; i++)
			{
				System.out.println("enter " + i + "th child of "+currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				currentNode.children.add(child);
				pendingNode.enqueue(child);
			}
		}
		return root;
	}
	
	
	public static void printTree(TreeNode<Integer> root)
	{
		String tobePrinted = root.data + " : ";
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			TreeNode<Integer> currentChild = root.children.get(i);
			tobePrinted += currentChild.data + ",";
		}
		System.out.println(tobePrinted);
		
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			TreeNode<Integer> currentChild = root.children.get(i);
			printTree(currentChild);
		}
	}
	
	
	public static int countNoOfNodes(TreeNode<Integer> root) {
		int count = 1;
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			count += countNoOfNodes(root.children.get(i));
		}
		return count;
	}
	
	
	public static int sumofNodes(TreeNode<Integer> root)
	{	
		int sum = root.data;
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			sum += sumofNodes(root.children.get(i));
		}
		return sum;
	}
	
	
	public static int findlargest(TreeNode<Integer> root, int max)
	{	
		if(max < root.data)
		{
			max = root.data;
		}	
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			max = findlargest(root.children.get(i),max);
		}
		return max;
	}
	
	
	// return object 
	public static int find2ndlargest(TreeNode<Integer> root, int firstlargest, int seclargest)
	{	

	
		if(firstlargest < root.data && seclargest < root.data )
		{
			int temp = firstlargest;
			firstlargest = root.data;
			seclargest = temp;	
		}
		
		else if ( firstlargest > root.data && seclargest < root.data)
			seclargest = root.data;
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			seclargest = find2ndlargest(root.children.get(i),firstlargest,seclargest);
		}	
		
		return seclargest;
	}
	
	
	public static int heightoftree(TreeNode<Integer> root,int ht)
	{
		int height = 1;
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			height += heightoftree(root.children.get(i),height);
			if(height > ht)
				return height;
			else
				return ht;
		} 
		return height-1;
	}
	
	
	public static int NoOfnodesGreater(TreeNode<Integer> root , int x)
	{	
		int count = 0;
		if(root.data > x)
		{	
			count  = 1;
		}
		
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			count += NoOfnodesGreater(root.children.get(i),x);
		}
		return count;
	}
	
	public static void printdepthk(TreeNode<Integer> root , int k)
	{
		if(k == 0 )
			System.out.print(root.data + ",");
		for(int i = 0 ; i < root.children.size() ; i++)
		{
			printdepthk(root.children.get(i), k-1);
		}
	}
	
	
	
	public static void preOrder(TreeNode<Integer> root){
		if(root == null)
			return;
		System.out.println(root.data);
		for(int i = 0 ; i < root.children.size() ; i++)
			preOrder(root.children.get(i));
	}
	
	
	public static void removeleafnode(TreeNode<Integer> root)
	{
		if(root == null)
		{
			
		}
	}

	
	
	
	// 10 3 15 20 30 2 25 35 2 12 24 1 45 0 0 0 0 0 
	public static void main(String[] args) {
		
		TreeNode<Integer> root = takeinputLevelWise();
		printTree(root);
		System.out.println("No of node : " + countNoOfNodes(root));
		System.out.println("sum : " + sumofNodes(root));
		System.out.println("largest : " + findlargest(root, -1));
		System.out.println("2nd largest : " + find2ndlargest(root, -1, -1));
		System.out.println("height : " + heightoftree(root, 0));
		System.out.println("Node greater than x : "  + NoOfnodesGreater(root, 20));
		System.out.println("Kdepth print : " );
		printdepthk(root, 2);
		System.out.println("preorder");
		preOrder(root);
		
	}
}
