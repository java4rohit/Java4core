package com.java4rohit.StackImpl;

public class MyStack {

	int stack[] = new int[5];
	int top;

	public void push(int data) {

		if (top == 5) {
			System.out.println("Stack is full");
		} else {
			stack[top] = data;
			top++;

		}

	}
  
	public int pop() {
		int data = 0;

		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}

		else {

			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}

	public int peek() {
		int data;

		data = stack[top - 1];
		return data;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public void show() {

		for (int n : stack) {
			System.out.println("stack element=="+n + " ");
		}

	}

}
