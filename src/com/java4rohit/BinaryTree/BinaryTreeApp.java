package com.java4rohit.BinaryTree;

public class BinaryTreeApp {

	public static void main(String[] args) {

		BinaryTree node = new BinaryTree();

		TreeNode root = node.createNode(2);
		root.left = node.createNode(7);
		root.right = node.createNode(5);
		root.left.left = node.createNode(2);
		root.left.right = node.createNode(6);
		root.left.right.left = node.createNode(5);
		root.left.right.right = node.createNode(11);
		root.right.right = node.createNode(9);
		root.right.right.left = node.createNode(4);
		System.out.println("preOrder");
 
		node.preOrder(root);
		System.out.println();
		System.out.println("postOder");

		node.PostOrder(root);
		System.out.println();
		System.out.println("Inoder");

		node.inOrder(root);

	}

}
