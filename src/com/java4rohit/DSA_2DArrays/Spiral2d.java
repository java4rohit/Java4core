package com.java4rohit.DSA_2DArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spiral2d {
	public static List<Integer> spiralOrder(int[][] matrix) {

	    List<Integer> list= new ArrayList<>();
		int prd = matrix.length * matrix[0].length;
		int count = 0;
		int minC = 0;
		int minR = 0;
		int maxR = matrix.length - 1;
		int maxC = matrix[0].length - 1;

		while (count < prd) {
			// left wall
			for (int j = minC, i = minR; j <= maxC && count < prd; j++) {
				list.add(matrix[minR][j]);

				count++;
			}
			minR++;
//
//	//bottom wall
			for (int i = minR, j = maxC; i <= maxR && count < prd; i++) {
				list.add(matrix[i][maxC]);
				count++;

			}
			maxC--;
//	
			// right wall
			for (int j = maxC, i = maxR; j >= minC && count < prd; j--) {
				list.add( matrix[maxR][j]);

				count++;
			}
			maxR--;

			// top wall
			for (int j = minC, i = maxR; i >= minR && count < prd; i--) {
				list.add(matrix[i][minC]);

				count++;
			}
			minC++;
		}
		return list;

	}

	public static void main(String[] args) {

		int[][] matrix = { { 11, 12, 13, 14, }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==================================");

		System.out.println(spiralOrder(matrix));

	}

}
