package edu.pitt.is1017.helloanimals;

public class Mammal extends Animal {

	
	public Mammal (int age, String color, int weight, int minimumWeight) {
		super(age,color,weight,minimumWeight);
	}
	
	
	
	@Override
	public void move(){
		super.setWeight(super.getWeight()-2);
		super.move();
	}
	
	
	/*
	public void run () {
		super.setWeight(super.getWeight()-2);
		super.move();
	}
	*/
}
