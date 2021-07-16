package com.java4rohit.SortingAlgorithm;

import java.util.Arrays;

public class HeapSort {

	static void heapsort(int[] arr) {
//
		int n = arr.length;
		// bulid max heap//

		for (int i = n / 2-1; i >=0; i--) {
			heapify(arr, n, i);
		}

		// deleteing
		for (int i = n -1; i >=0; i--) {
			// swap
			int swap = arr[0];
			arr[0] = arr[i];
			arr[i] = swap;

			heapify(arr, i, 0);
		}
	}

	static void heapify(int[] arr, int n, int i) {

		int largest = i;
		int l = 2 * i+1 ;
		int r = 2 * i + 2;

		while (l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		while (r <n && arr[r] > arr[largest]) {
			largest = r;
		}
		if (largest != i) {

			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);

		}

	}

	public static void main(String[] args) {
		int arr[] = { 15, 5, 20, 1, 7, 10, 30 };
		int n = arr.length;

		heapsort(arr);

		System.out.println(Arrays.toString(arr));

	}

}
