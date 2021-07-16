package com.java4rohit.ArraysList;

import java.util.ArrayList;

public class oddAndEven {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		ArrayList al1 = new ArrayList();
	ArrayList al2 = new ArrayList();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				al1.add(arr[i]);

			} else {
			al2.add(arr[i]);
			}
		}
		System.out.println("it is even"+al1);
		System.out.println("it is odd"+al2);
	}

}
