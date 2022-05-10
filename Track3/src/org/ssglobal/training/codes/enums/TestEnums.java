package org.ssglobal.training.codes.enums;

public class TestEnums {

	public static void main(String[] args) {

		Flower flower = Flower.ROSE;
		System.out.println(Flower.ROSE.hashCode());
		System.out.println(flower.hashCode());
		System.out.println(flower.name());
		System.out.println(flower.toString());
		System.out.println(flower.ordinal());
		
		if(flower == Flower.GUMAMELA) {
			System.out.println("The flower is gumamela.");
		}else {
			System.out.println("not gumamela");
		}
		
		switch(flower) {
			case SANTAN:
				System.out.println("The flower is gumamela.");
				break;
			case GUMAMELA:
				System.out.println("The flower is gumamela.");
				break;
			case ROSE:
				System.out.println("The flower is rose.");
				break;
		}
		System.out.println(flower.equals(Flower.GUMAMELA));
		
		for (Flower f : flower.values()) {
			System.out.println(f.name());
		}
		
		
		
	}

}
