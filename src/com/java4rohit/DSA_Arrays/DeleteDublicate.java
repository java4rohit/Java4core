package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

public class DeleteDublicate {

	public static int DeleteDublicateElements(int[] arr, int n) {

		if (n == 0 || n == 1)
			System.out.println("1" + arr);

		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}

		temp[j] = arr[n - 1];
		j++;
		System.out.println("temp size-" + j);

		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 4, 4, 5, 5 };

		int n = arr.length;
		n = DeleteDublicateElements(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();

		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {

				arr[j] = arr[i];
				j++;

			}
		}
		arr[j] = arr[n - 1];
		j++;
		
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
