package org.ssglobal.training.codes.oop;

public abstract class AnimalKingdom {


	public abstract void eat();
	
}

class Bird extends AnimalKingdom implements IBirdContract{

	@Override
	public void swim() {}

	@Override
	public void fly() {}

	@Override
	public void walk() {}

	@Override
	public void eat() {}

	@Override
	public void jump() {}
	
}

class Fish extends AnimalKingdom implements IFishContract{

	@Override
	public void swim() {}

	@Override
	public void fly() {}

	@Override
	public void eat() {}

	
}

class Mammal extends AnimalKingdom implements IMammalContract{

	@Override
	public void swim() {}

	@Override
	public void walk() {}

	@Override
	public void eat() {}

	@Override
	public void jump() {}
	
}
	
