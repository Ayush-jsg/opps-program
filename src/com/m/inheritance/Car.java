package com.m.inheritance;

class vehical {
	String vehicaltype;

}

public class Car extends vehical {

	String modeltype;

	public void showdetail() {
		vehicaltype = "car";
		modeltype = "sports";
		System.out.println(modeltype + " " + vehicaltype);

	}

	public static void main(String[] args) {
		Car car = new Car();
		car.showdetail();

	}
}
