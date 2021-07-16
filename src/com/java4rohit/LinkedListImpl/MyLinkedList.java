package com.java4rohit.LinkedListImpl;

import java.util.Arrays;

public class MyLinkedList {

	Node head;

	public void add(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;

		} else {
			addAtLast(data);
		}
	}

	public void addIndexFast(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		node.next = head;
		head = node;
	}

	private void addAtLast(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}
		temp.next = node;

	}

	public void show() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}

	}

	public void isEmpty() {
		if (head != null) {
			System.out.println("List is not  Empty");
		} else {
			System.out.println("List is empty");
		}
	}

	public void addAtIndex(int data, int index) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		Node temp = head;

		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;

		}
		node.next = temp.next;
		temp.next = node;

	}

	public void delete(int index) {

		if (index == 0) {
			head = head.next;
		}

		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;
	}

	public Node rotate(int k) {

		if (k == 0 || head.next == null || head == null) {
			return head;
		}
		Node temp = head;
		int len = 1;
		while (temp.next != null) {
			len++;
			temp = temp.next;
		}

		// 2 last -- to head
		temp.next = head;

		k = k % len;
		k = len - k;

		while (k-- > 0) {
			temp = temp.next;
		}
		head = temp.next;
		temp.next = null;
		return head;

	}

	public int get(int index) {

		Node temp = head;
		int len=0;
		Node l=head;
		while(l.next!=null) {
			len++;
			l=l.next;
		}
		
		if(index>len && index<0) {
			System.out.println(-1);
		}
		
		for( int i= 0 ;  i < index; i++) {
			temp=temp.next;
		}
		return temp.data;
	}
}
