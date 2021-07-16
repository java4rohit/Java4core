package com.java4rohit.timeAndSpaceSorting;

public class MergeTwoSortedArrays {

	public static int[] mergeTwoSortarrays(int[] a, int[] b) {

		int res[] = new int[a.length + b.length];

		System.out.println("length  of a new arrays:=" + res.length);

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {

			if (a[i] < b[j]) {
				res[k] = a[i];

				i++;
				k++;

			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}

		while (i < a.length) {
			res[k] = a[i];
			i++;
			k++;

		}
		while (j < b.length) {
			res[k] = b[j];
			j++;
			k++;

		}
		return res;
	}

	public static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

	public static void main(String[] args) {

		int a[] = { 2, 5, 12, 18, 20 };
		System.out.println("a length:=" + a.length);
		int b[] = { 7, 9, 11, 15, 25, 28, 30, 35 };
		System.out.println("b length:=" + b.length);

		int[] merge = mergeTwoSortarrays(a, b);
		print(merge);

	}

}
