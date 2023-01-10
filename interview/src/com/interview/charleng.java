package com.interview;

public class charleng {

	public static void main(String[] args) {

		String a = "ASPIRE SYSTEMS TECHNOLOGIES PRIVATE LIMITED COMPANY";

		String[] b = a.split(" ");

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i].charAt(i));

			System.out.println("*");
		}

	}

}
