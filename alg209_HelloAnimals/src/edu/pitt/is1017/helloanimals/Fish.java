package edu.pitt.is1017.helloanimals;

public class Fish extends Animal {
	
	
	
	public Fish (int age, String color, int weight, int minimumWeight) {
		super(age,color,weight,minimumWeight);
	}
	
	
	/* This overrides the move method of the animal class and makes it so that the fish
	 * loses one from weight when it is called to move. After it moves it makes sure that
	 * the weight isn't below the minimum required weight.
	 */
	@Override
	public void move(){
		super.setWeight(super.getWeight()-1);
		super.move();
			
	}
	
	/*
	 * I had this swim method but didn't use it because I thought just creating a move method would
	 * be more efficient
	/*
	public void swim () {
		super.setWeight(super.getWeight()-1);
		super.move();
	}
	*/

}
