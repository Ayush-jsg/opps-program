package com.m.inheritance;

class parent2 {
	String name;

	void details() {
		System.out.println(name.toUpperCase());
	}

}

public class Child2 extends parent2 {
	String name;

	public void details() {
		super.name = "parent";
		name = "child";
		System.out.println(super.name + "and" + name);
		super.details();

	}

	public static void main(String[] args) {
		Child2 cobj = new Child2();
		cobj.details();

	}
}
