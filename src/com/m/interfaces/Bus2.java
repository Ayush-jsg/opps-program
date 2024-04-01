package com.m.interfaces;

  // static method in interfaces

interface Vehicle2 {
	static void cleanvehicle() {
		System.out.println("i am cleaning vehicle");
	}
}

public class Bus2 implements Vehicle2 {
	public static void main(String[] args) {
		Vehicle2.cleanvehicle();
	}

}
