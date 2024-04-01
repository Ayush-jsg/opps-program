package com.m.polymorphism;

// method overriding example

class Animal {

	public void eat() {
		System.out.println("eat all eatables");
	}
}

class Dog extends Animal {

	public void eat() {
		System.out.println("dog like to eat meat");
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();
	}
}
