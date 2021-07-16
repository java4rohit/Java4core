package com.java4rohit.ArraysList;

public class PrimeNoInArrays {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 2; j <= arr[i] - 1; j++) {

				if (arr[i] % j == 0) {
					count = count + 1;
				}
			}
			if (count == 0)
				System.out.print(arr[i] + " ");

			else if (count != 0) {
				System.out.println();
				System.out.println(arr[i] + " ");
			}
		}
	}

}
