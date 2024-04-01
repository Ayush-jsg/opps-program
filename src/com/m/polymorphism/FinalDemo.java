package com.m.polymorphism;

public final class FinalDemo {

	final int a = 10;

	final void m1() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.m1();
	}

}
