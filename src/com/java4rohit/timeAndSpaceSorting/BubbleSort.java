package com.java4rohit.timeAndSpaceSorting;
/**
 * 
 * @author java4rohit
 *  time complexity o(n^2)
 */
public class BubbleSort {

	public static void bubblesort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (isSmaller(arr, j, i)) {
					swap(arr, j, i);
				}
			}
		}
	}

	private static boolean isSmaller(int[] arr, int j, int i) {

		if (arr[j] > arr[j + 1]) {

			return true;
		}
		return false;
	}

	public static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}

	private static void print(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 5, 1, 4, 2, 8 };
		int n = arr.length;
		bubblesort(arr, n);
		print(arr, n);
	}

}
