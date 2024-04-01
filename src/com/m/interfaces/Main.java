package com.m.interfaces;

  // implements an interface

interface Language {
	void getname(String name);
}

class ProLanguage implements Language {
	@Override
	public void getname(String name) {
		System.out.println("programming language " + name);

	}

}

public class Main {
	public static void main(String[] args) {
		ProLanguage pl = new ProLanguage();
		pl.getname("java");

	}

}
