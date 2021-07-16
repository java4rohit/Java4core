package com.java4rohit.timeAndSpaceSorting;

public class SelectionSort {

	public static void SelectionSort(int[] arr, int n) {

		for (int i = 0; i < n - 1; i++) {

			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (isgreaterthan(arr, j, min)) {
					min = j;
				}
			}
			swap(arr, min, i);
		}

	}

	//// comparing method
	public static boolean isgreaterthan(int[] arr, int j, int min) {
		if (arr[min] > arr[j]) {
			return true;
		}
		return false;

	}

	// swaping method
	public static void swap(int[] arr, int min, int i) {

		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
	}

	public static void print(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 5, 7, -2, 4, 1, 3 };
		int n = arr.length;
		SelectionSort(arr, n);

		print(arr, n);

	}

}
