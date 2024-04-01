package com.m.inheritance;

class Parent {
	public void p1() {
		System.out.println("parents method");
	}
}

public class Child extends Parent {
	public void c1() {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		Child cobj = new Child();
		cobj.c1();  //method of child class
		cobj.p1(); // method of parent class

	}

}
