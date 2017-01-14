package edu.pitt.is1017.helloanimals;

import java.util.Vector;

public class Main {
	
	
	public static void main(String[] args) {
		
		//Here I created one of each type of animal
		Animal bear = new Mammal(8,"black",150,100);
		Animal marlin = new Fish(3,"blue",7,5);
		Animal eagle = new Bird(5,"brown",15,10);
		
		//This is a vector with one of each of the types of animals I created
		Vector<Animal> vector1= new Vector<Animal>();
		vector1.add(bear);
		vector1.add(marlin);
		vector1.add(eagle);
		
		//This is a for loop of the vector that makes each animal eat and move, and then prints the output
		for(Animal a: vector1) {
			a.eat();
			a.move();
			a.output();
		}
		
	}

}
