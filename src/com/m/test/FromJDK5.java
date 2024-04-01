package com.m.test;

// WRITE METHOD WITH VAR ARGS FROM JAVA 1.5;

public class FromJDK5 {
	public static void main(String[] args) {
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
	}

	public static void sum(int... x) {

		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total = total + x[i];
		}
		System.out.println(total);
	}

}
