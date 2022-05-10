package org.ssglobal.training.codes.oop;

public class TestAnimals {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Fish fish = new Fish();
		Mammal mammal = new Mammal();
		
		System.out.println(bird instanceof AnimalKingdom);
		System.out.println(fish instanceof AnimalKingdom);
		System.out.println(mammal instanceof AnimalKingdom);
		
		System.out.println(bird instanceof IBirdContract);
		System.out.println(fish instanceof IFishContract);
		System.out.println(mammal instanceof IMammalContract);
	}

}
