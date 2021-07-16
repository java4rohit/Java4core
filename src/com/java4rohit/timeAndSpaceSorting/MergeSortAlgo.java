package com.java4rohit.timeAndSpaceSorting;

public class MergeSortAlgo {

	public static int[] MergeSort(int[] arr, int low, int high) {

		if (low == high) {
			int[] ba = new int[1];
			ba[0] = arr[low];
			return ba;
		}

		int mid = (low + high) / 2;
		int[] fsh = MergeSort(arr, low, mid);
		int[] ssh = MergeSort(arr, mid + 1, high);
		int[] fsa = MergeSortedArray(fsh, ssh);

		return fsa;

	}

	public static int[] MergeSortedArray(int[] a, int[] b) {

		System.out.println("Merging two Arrays->");
		System.out.println("Left Arrays->");
		print(a);
		System.out.println("Right Arrays->");
		print(b);
		int i = 0, j = 0, k = 0;

		int ans[] = new int[a.length + b.length];

		while (i < a.length && j < b.length) {

			if (a[i] <= b[j]) {
				ans[k] = a[i];
				i++;
				k++;
			} 
			else 
			{
				ans[k] = b[j];
				j++;
				k++;
			}

		}
		while (i < a.length) {
			ans[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			ans[k] = b[j];
			j++;
			k++;
		}

		return ans;
	}

	public static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 53, 2, 8, 65, 4, 32, 89, 6, 54, 32 };
		int n = arr.length-1;
		int[] sa = MergeSort(arr, 0, n);
		System.out.println("Sorted Array->");
		print(sa);

	}

}
