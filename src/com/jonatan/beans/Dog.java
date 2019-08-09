package com.jonatan.beans;

public class Dog extends Animal implements Pet {

	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {

		String result;
		
		if (this.getWeight() < 30) {
			result = this.getName() + " hopped into your lap and cuddled you!";
		} else {
			result = this.getName() + " curled up next to you!";
		}
		
		return result;

	}

}
