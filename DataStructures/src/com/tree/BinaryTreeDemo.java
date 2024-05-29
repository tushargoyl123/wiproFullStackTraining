package com.tree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree(10);
		tree.insertLeft(tree.root, 5);
		tree.insertRight(tree.root, 15);
		tree.insertLeft(tree.root.left, 3);
		tree.insertRight(tree.root.left, 8);
		tree.insertLeft(tree.root.right, 12);
		BinaryTree.preOrder(tree.root);
		System.out.println();
		BinaryTree.inorder(tree.root);
		System.out.println();
		BinaryTree.postOrder(tree.root);
	}

}
