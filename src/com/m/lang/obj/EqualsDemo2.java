package com.m.lang.obj;

public class EqualsDemo2 {

	int rno;
	String name;

	EqualsDemo2(int rno, String name) {
		this.rno = rno;
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {

		EqualsDemo2 ed = (EqualsDemo2) obj;

		if (this.name.equals(ed.name) && this.rno == ed.rno) {
			return true;
		} else {
			return false;
		}

	}

}
