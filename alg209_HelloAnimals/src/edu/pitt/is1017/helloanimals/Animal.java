package edu.pitt.is1017.helloanimals;

public class Animal {
	
	private int age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;
	
	public Animal (int age, String color, int weight, int minimumWeight) {
		this.age=age;
		this.color=color;
		this.weight=weight;
		this.minimumWeight=minimumWeight;
	}
	
	//Adds one to the animals weight
	public void eat () {
		weight+=1;
	}
	
	/*This method wasn't in the uml diagram, but I added this so that I can make all animal objects move together
	 * and then overrode each specific animals move in their class to match the specifications in the guidelines.
	 * What this particular move method does is ensure that the animals weight doesn't fall below the minimum
	 * required weight.
	 */
	public void move(){
		if(weight<minimumWeight){
			weight=minimumWeight;
		}
	}


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//This prints out the final weight of the animal
	public void output() {
		String results = "Final weight: " + weight;
		System.out.println(results);
	}

}
