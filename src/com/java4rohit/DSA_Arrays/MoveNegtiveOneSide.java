package com.java4rohit.DSA_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegtiveOneSide {

	private static void moveOneSide(int[] arr) {

//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		int j = 0, temp;
		int n = arr.length;
		 
		for (int i = 0; i < n; i++) {
		///                         	int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
			if (arr[i] < 0) {
				System.out.println("1"+Arrays.toString(arr));
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println("2"+Arrays.toString(arr));
				}
				j++;
			} 
		}
		System.out.println("3"+Arrays.toString(arr));
	}

	public static void main(String[] args) {

//		Scanner sc= new Scanner(System.in);
//		int n= sc.nextInt();
//		
//		int arr[]= new int [n];
//		for( int i = 0; i <  n ; i++) {
//			arr[i]= sc.nextInt();
//		}

		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

		moveOneSide(arr);

	}

}
