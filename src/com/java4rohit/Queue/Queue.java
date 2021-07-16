package com.java4rohit.Queue;

public class Queue {

	int capacity = 4;
	int queue[] = new int[capacity];

	int front = 0;
	int rear = 0;
	int size = 0;

	public void enQueue(int data) {

		if(capacity==getsize()) {
			expand();
		}
		queue[rear] = data;
		rear = (rear + 1);
		size = size + 1;

	}

	private void expand() {
		int len = getsize();
		int newQueue[] = new int[capacity * 2];

		System.arraycopy(queue, 0, newQueue, 0, len);
		queue = newQueue;
		capacity = capacity * 2;

	}

	public int dQueue() {

		int data = queue[front];

		if (!isEmpty()) {
			front = (front + 1);
			size = size - 1;

		} else
			System.out.println("is empty");

		return data;

	}

	public int getsize() {
		return size;
	}

	public boolean isEmpty() {

		return getsize() == 0;
	}

	public void show() {
		System.out.println("Elements:");
		for (int i = 0; i < getsize(); i++) {
			System.out.println(queue[front+i] + " ");
		}
	}

	public boolean isfull() {

		return getsize() == 5;
	}

}
