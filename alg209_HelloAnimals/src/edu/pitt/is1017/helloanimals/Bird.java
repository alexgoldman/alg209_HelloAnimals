package edu.pitt.is1017.helloanimals;

public class Bird extends Animal {
	
	
	public Bird (int age, String color, int weight, int minimumWeight) {
		super(age,color,weight,minimumWeight);
	}
	
	
	
	
	@Override
	public void move(){
		super.setWeight(super.getWeight()-2);
		super.move();
	}
	
	/*
	public void fly () {
		super.setWeight(super.getWeight()-2);
		super.move();
	}
	*/

}
