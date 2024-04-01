package com.m.polymorphism;

// method overloading example

public class Calculator {

	void sum(int a, int b) {
		System.out.println("sum is " + (a + b));
	}

	void sum(float a, float b) {
		System.out.println("sum is " + (a + b));
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sum(8, 5);
		c.sum(4.6f, 3.8f);
	}

}
