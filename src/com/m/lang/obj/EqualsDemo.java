package com.m.lang.obj;

public class EqualsDemo {
	public static void main(String[] args) {
		String str = new String("monu");
		String str1 = new String("monu");

		System.out.println(str.equals(str1)); // true

		Student6 s = new Student6(1, "monu");
		Student6 s1 = new Student6(2, "amkit");
		System.out.println(s.equals(s1));  //false reference checking
	}

}

class Student6 {
	int rno;
	String name;

	Student6(int rno, String name) {
		this.name = name;
		this.rno = rno;
	}
}
