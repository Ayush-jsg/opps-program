package com.m.lang.obj;

public class FinalizeDemo {

	public static void main(String[] args) {

		FinalizeDemo fd = new FinalizeDemo();
		fd = null;
		System.gc();

	}

	protected void finalize() {
		System.out.println("finalize() method called");
	}

}
