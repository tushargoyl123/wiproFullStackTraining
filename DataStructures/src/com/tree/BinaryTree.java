package com.tree;

public class BinaryTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}
	public BinaryTree(int d){
		root = new Node(d);
	}
	public void insertLeft(Node r, int d) {
		Node node = new Node(d);
		r.left = node;
	}
	public void insertRight(Node r, int d) {
		Node node = new Node(d);
		r.right = node;
	}
	public static void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	public static void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
}
