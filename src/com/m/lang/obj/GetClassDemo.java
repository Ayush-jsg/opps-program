package com.m.lang.obj;
// example get class()

public class GetClassDemo {
	public static void main(String[] args) {
		Student3 s = new Student3(1, "monu");
		System.out.println(s.getClass().getName());
		System.out.println(s.getClass().getSuperclass());
	}

}

class Student3 {
	int id;
	String name;

	public Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
