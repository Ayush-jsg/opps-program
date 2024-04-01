package com.m.lang.obj;

public class HashCodeDemo2 {

	public static void main(String[] args) {
		Student5 s = new Student5(1, "monu");
		Student5 s1 = new Student5(2, "ankit");

		System.out.println(s.hashcode());
		System.out.println(s1.hashcode());
	}

}

class Student5 {
	static int count = 1;
	int rno;
	String name;

	Student5(int rno, String name) {
		this.rno = rno;
		this.name = name;

	}

	public int hashcode() {
		return count++;
	}

}
