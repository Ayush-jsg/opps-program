package com.m.Abstraction;

abstract class vehicle {
	public abstract void engine();
}

public class Car extends vehicle {
	public void engine() {
		System.out.println("car engine");
	}

	public static void main(String[] args) {
		vehicle v = new Car();

		v.engine();

	}

}
