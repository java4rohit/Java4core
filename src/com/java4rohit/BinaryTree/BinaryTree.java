package com.java4rohit.BinaryTree;

public class BinaryTree{
	
	public TreeNode createNode(int data){
		TreeNode node= new TreeNode();
		node.data=data;
		node.left=null;
		node.right=null;
		
		return node;
	}
	
	public void preOrder(TreeNode node) {
		
		if(node==null) {
			return;
		}
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	public void inOrder(TreeNode node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	
	public void PostOrder(TreeNode node) {
		if(node==null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data+" ");
	}

}
