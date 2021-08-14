package com.java4rohit.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateClient {

	public static void main(String[] args) {
		System.out.println("Time in Millis: " + System.currentTimeMillis());

		System.out.println("==============Date===================");

		Date date = new Date();

		SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFor.format(date));
		System.out.println("Complete Date: " + date);

		System.out.println(date.getDate());
		System.out.println(date.getHours());
		System.out.println(date.getDay());
		System.out.println(date.getMinutes());
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
		System.out.println(date.getTimezoneOffset());
		System.out.println(date.getYear());

		System.out.println("==============Local Date==================");

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println(localDate.getDayOfWeek());
		System.out.println("Year : " + localDate.getYear());
		System.out.println("Month : " + localDate.getMonth().getValue());
		System.out.println("Day of Month : " + localDate.getDayOfMonth());
		System.out.println("Day of Week : " + localDate.getDayOfWeek());
		System.out.println("Day of Year : " + localDate.getDayOfYear());
		System.out.println("Day of Year : " + localDate.isLeapYear());
	}
}
