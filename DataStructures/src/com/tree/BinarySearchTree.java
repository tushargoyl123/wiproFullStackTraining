package com.tree;

public class BinarySearchTree {
	Node root;
	class Node{
		int key;
		Node left,right;
		public Node(int val) {
			key = val;
			left = right = null;
		}
	}
	public BinarySearchTree(int val) {
		root = new Node(val);
	}
	public BinarySearchTree() {
		root = null;
	}
	public Node insert(Node root, int val) {
		if(root==null) return new Node(val);
		if(val<root.key) root.left = new Node(val);
		else root.right = new Node(val);
		return root;
	}
	public void insert(int val) {
		insert(root,val);
	}
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.key);
			inOrder(root.right);
		}
	}
	public Node search(Node root, int val) {
		if(root==null || root.key==val) return root;
		if(val<root.key) return search(root.left,val);
		else return search(root.right,val);
	}
	public int min(Node root) {
		int minVal = root.key;
		while(root.left!=null) {
			minVal = root.left.key;
			root = root.left;
		}
		return minVal;
	}
	
	
}
