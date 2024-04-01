package com.m.test;

// How we will write method before java - 5

public class BeforeJDK5 {
	public static void main(String[] args) {
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);

	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void sum(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public static void sum(int a, int b, int c, int d, int e) {
		System.out.println(a + b + c + d + e);
	}

}
