package com.m.interfaces;
// functional interface example

interface Sayable {
	void say(String msg);
}

public class Example implements Sayable {
	@Override
	public void say(String msg) {
		System.out.println(msg);

	}

	public static void main(String[] args) {
		Example ex = new Example();
		ex.say(" hello there");
	}

}
