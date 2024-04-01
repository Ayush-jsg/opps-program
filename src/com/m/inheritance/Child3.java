package com.m.inheritance;
//Example of child class calling parent class constructor using super keyword

class Parent3 {
	String name;

	public Parent3(String n) {
		name = n;

	}
}

public class Child3 extends Parent3 {
	String name;

	public Child3(String n1, String n2) {
		super(n1);
		this.name = n2;

	}

	public void details() {
		System.out.println(super.name + " and " + name);
	}

	public static void main(String[] args) {
		Child3 cobj = new Child3("parent", "child");
		cobj.details();

	}

}
