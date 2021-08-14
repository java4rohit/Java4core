package com.java4rohit.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderPrice {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> orderMap = new HashMap<>();

		while (scan.hasNext()) {

			int menu = scan.nextInt();
			int quant = scan.nextInt();
			orderMap.put(menu, quant);

			String more = scan.next();

			if (more.equalsIgnoreCase("Y")) {
				continue;
			} else {
				calCulatePrice(orderMap);
				break;
			}

		}
	}

	public static void calCulatePrice(Map<Integer, Integer> orderMap) {

		double totalamount = 0;

		for (Map.Entry<Integer, Integer> entrySet : orderMap.entrySet()) {

			int itemNumner = entrySet.getKey();
			int quant = entrySet.getValue();

			totalamount = totalamount + priceMap().get(itemNumner) * quant;
		}

		System.out.println(totalamount);

	}

	public static Map<Integer, Double> priceMap() {
		Map<Integer, Double> priceMap = new HashMap<>();
		priceMap.put(1, 50.0);
		priceMap.put(2, 70.0);
		priceMap.put(3, 30.0);
		return priceMap;

	}

}

/*
 * question 1.. 1 Rice 50.0 2 Paratha 25.0 3 Dal 60.0
 */
//iNPUT 1 2 Y 2 1 N
//OUTPUT 125



