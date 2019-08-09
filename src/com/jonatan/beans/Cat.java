package com.jonatan.beans;

public class Cat extends Animal implements Pet {

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		
		return "Your " + this.getBreed() + " cat, " + this.getName() +
				", looked at you with some affection, you think.";

	}
}
