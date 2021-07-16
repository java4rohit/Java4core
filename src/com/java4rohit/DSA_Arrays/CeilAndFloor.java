package com.java4rohit.DSA_Arrays;

public class CeilAndFloor {

	public static void main(String[] args) {

		int arr[] = { 10,20,30,40,50,60,70,80,90};
		int data = 61;

		int low = 0;
		int high = arr.length - 1;
		int floor = 0;
		int ceil = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (data < arr[mid]) 
			{
				high = mid - 1;
				ceil = arr[mid];

			} else if (data > arr[mid]) {
				low = mid + 1;
				floor = arr[mid];
			} else {
				ceil = arr[mid];
				floor = arr[mid];
				break;
			}

		}

		System.out.println(ceil);
		System.out.println(floor);

	}

}
