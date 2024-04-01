package com.m.lang.obj;

public class HashCodeDemo {

	public static void main(String[] args) {
		Student4 s = new Student4(1, "monu");
		Student4 s1 = new Student4(2, "ankit");

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}

class Student4 {
	int id;
	String name;

	public Student4(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
