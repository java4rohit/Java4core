package com.java4rohit.LinkedListImpl;

public class MainLinkedList {

	public static void main(String[] args) {

		MyLinkedList n = new MyLinkedList();
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		n.add(7);

		n.show();
		
		System.out.println();
	   System.out.println(n.get(2));
	

	}

}
