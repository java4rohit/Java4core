package com.java4rohit.DSA_Arrays;

/**
 * input:================== 0 1 2 3 4 5 6 7 8 9 10 11 12 13 sorted arrays
 * {1,2,3,4,4,4,4,4,6,7, 8, 8, 8, 8} index of 4 output:=============== starting
 * index 3 -7 ans
 */

public class FirstIndexLastIndex {
	public static void main(String[] args) {
		int arr[] = {1,2,3,3,3,5};
		int data =3 ;
		int low = 0;
		int high = arr.length - 1;
		int first = -1;

		while (low <= high) {
			int mid = low+(high-low) / 2;

			if (data > arr[mid]) {
				low = mid + 1;
			} else if (data < arr[mid]) {
				high = mid - 1;
			} else {
				first = mid;
				high = mid - 1;
			}
		}
		System.out.println(first);
		
		 low = 0;
		 high = arr.length - 1;
		int last = -1;

			while (low <= high) {
				int mid = low+(high-low) / 2;

				if (data > arr[mid]) {
					low = mid + 1;
				} else if (data < arr[mid]) {
					high = mid - 1;
				} else {
					last = mid;
					low = mid +  1;
				}
			}
			System.out.println(last);
		
	
	}

}
