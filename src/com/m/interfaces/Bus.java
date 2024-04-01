package com.m.interfaces;

  // default method in interface

interface vehicle {
	void cleanvehicle();

	default void startvehicle() {
		System.out.println("vehicle is starting");
	}

}

public class Bus implements vehicle {
	@Override
	public void cleanvehicle() {
		System.out.println("cleaning the vehicle");

	}

	public static void main(String[] args) {
		Bus b = new Bus();
		b.cleanvehicle();
		b.startvehicle();
	}

}
