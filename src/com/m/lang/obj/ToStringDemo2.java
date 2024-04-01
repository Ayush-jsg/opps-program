package com.m.lang.obj;

// example on to string() method overriding in our class to get object data

public class ToStringDemo2 {

	public static void main(String[] args) {

		Student2 s = new Student2(1, "sachin");
		System.out.println(s);
		System.out.println(s.toString());

	}

}

class Student2 {
	int id;
	String name;

	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student [id=" + id + ", name=" + name + "]";
	}
}
