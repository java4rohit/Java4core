package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

public class MaxAndMinAvg {

	private static double printAVG(int[] salary) {
		
		int len = salary.length;
		System.out.println(len);
		
		Arrays.sort(salary);
		System.out.println(Arrays.toString(salary));
		
		double avg = 0;
		double sum = 0;
		double count=0;
		
		for (int i = 1; i < len - 1; i++) {

			System.out.println("index no"+i+"=="+salary[i]);
			
			sum = sum + salary[i];
			count++;

		}

		avg = sum / count;
		return avg;
	}

	public static void main(String[] args) {

		int salary[] = {48000,59000,99000,13000,78000,
				        45000,31000,17000,39000,37000,
				        93000,77000,33000,28000,4000,
				        54000,67000,6000,1000,11000 };

		Arrays.sort(salary);
		printAVG(salary);
		System.out.println();
		System.out.println("avg salary" + printAVG(salary));

	}

}
