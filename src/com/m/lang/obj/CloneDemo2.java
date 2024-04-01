package com.m.lang.obj;

public class CloneDemo2 implements Cloneable {

	int rno;
	String name;

	CloneDemo2(int rno, String name) {
		this.rno = rno;
		this.name = name;

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneDemo2 cd1 = new CloneDemo2(1, "monu");
		System.out.println(cd1.rno + " " + cd1.name); // 1 monu

		CloneDemo2 cd2 = (CloneDemo2) cd1.clone();
		System.out.println(cd2.rno + " " + cd2.name); // 1 monu

		cd1.rno = 45;
		cd1.name = "rohit";
		System.out.println(cd1.rno + " " + cd1.name); // 45 rohit
		System.out.println(cd2.rno + " " + cd2.name); // 1 monu

	}
}
