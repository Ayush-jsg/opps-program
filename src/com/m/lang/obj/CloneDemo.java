package com.m.lang.obj;

public class CloneDemo implements Cloneable {

	int rno;
	String name;

	CloneDemo(int rno, String name) {
		this.rno = rno;
		this.name = name;

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneDemo cd = new CloneDemo(1, "monu");
		System.out.println(cd.rno + " " + cd.name); // 1 monu

		CloneDemo cd1 = cd;
		System.out.println(cd1.rno + " " + cd1.name); // 1 monu

		cd1.rno = 45;
		cd.name = "rohit";
		System.out.println(cd.rno + " " + cd.name); // 45 rohit
		System.out.println(cd1.rno + " " + cd1.name); // 45 rohit

	}

}
