package org.ssglobal.training.codes.enums;

import java.util.EnumSet;
import java.util.Scanner;
import java.util.Set;

public class JollibeeMenu {
	
	//private List<JollibeeItem> basket = new ArrayList<>();
	//Set<JollibeeItem> basket = EnumSet.noneOf(JollibeeItem.class);
	Set<JollibeeItem> basket = EnumSet.of(JollibeeItem.JOLLY_SPAGHETTI);
	
	public void showMenu() {
		
		try(Scanner scan = new Scanner(System.in)){
			while(true) {
				System.out.println("Jolly Spaghetti [A]");
				System.out.println("ChickenJoy [B]");
				System.out.println("Shanghai Rolls [C]");
				System.out.println("Palabok [D]");
				System.out.println("Exit [D]");
				System.out.println("Enter an option");
				String option = scan.next();
				
				//basket
				switch(option.toUpperCase()) {
				case "A":
					basket.add(JollibeeItem.JOLLY_SPAGHETTI);
					break;
				case "B":
					basket.add(JollibeeItem.CHICKEN_JOY);
					break;
				case "C":
					basket.add(JollibeeItem.SHANGHAI_ROLLS);
					break;
				case "D":
					basket.add(JollibeeItem.PALABOK);
					break;
				}
				if(option.equalsIgnoreCase("E")) {
					break;
				}	
			}
			System.out.println("Bye");
		}catch (Exception e){
			System.err.println(e.getMessage());
		}
		double total = 0.0;
		for (JollibeeItem prod: basket) {
			System.out.format("%s %.3f \n", prod.getProduct(), (prod.getPrice() - prod.getDiscount()));
			total += (prod.getPrice() - prod.getDiscount());
		}
		System.out.format("Total: %.3f \n", total);
	}
}

class Jollibee{ // definition of enum
	
	private String product;
	private Float price;
	private Float discount;
	
	private Jollibee(String product, Float price, Float discount){
		
		this.product = product;
		this.price = price;
		this.discount = discount;
	}
	
	public static final Jollibee JOLLY_SPAGHETTI = new Jollibee("Jollibee Spaghetti", 100.00F, 0.0F);
	public static final Jollibee CHICKEN_JOY = new Jollibee("ChickenJoy", 150.00F, 0.0F);
	public static final Jollibee SHANGHAI_ROLLS = new Jollibee("Shanghai Rolls", 120.00F, 0.0F);
	public static final Jollibee PALABOK = new Jollibee("Palabok", 110.00F, 20.00F);
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}	
	
}
enum JollibeeItem{
	
	JOLLY_SPAGHETTI("Jollibee Spaghetti", 100.00F, 0.0F), 
	CHICKEN_JOY("ChickenJoy", 150.00F, 0.0F),
	SHANGHAI_ROLLS("Shanghai Rolls", 120.00F, 0.0F),
	PALABOK("Palabok", 110.00F, 20.00F); // Step 1 - put comma, semi-colon
	
	// Step 2 - override constructor
	// Step 3 - apply constructor injection to the instances
	private String product;
	private Float price;
	private Float discount;
	
	private JollibeeItem(String product, Float price, Float discount) {
		this.product = product;
		this.price = price;
		this.discount = discount;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return String.join("", product, String.valueOf(price), String.valueOf(discount));
	}
	
}
