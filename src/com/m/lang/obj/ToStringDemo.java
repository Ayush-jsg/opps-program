package com.m.lang.obj;

// example on object class to string() method

public class ToStringDemo {
	public static void main(String[] args) {

		Student s = new Student(1, "sachin");
		System.out.println(s);
		System.out.println(s.toString());

		Student s1 = new Student(1, "sachin");
		System.out.println(s1);

	}

}

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}
}