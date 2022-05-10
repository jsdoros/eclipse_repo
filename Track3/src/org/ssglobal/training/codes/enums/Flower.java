package org.ssglobal.training.codes.enums;

public enum Flower{

	SANTAN("Santan", "Santan", "Santan", 10, 9000.00F),
	ROSE("Rose", "xx", "yy", 5, 10000.00F),
	GUMAMELA("Gumamela", "aa", "bb", 12, 1500.00F);
	
	private  String genericName;
	private String scientificName;
	private String species;
	private Integer lifespan;
	private Float price;
	
	private Flower(String genericName, String scientificName, String species, Integer lifespan, Float price) {
		this.genericName = genericName;
		this.scientificName = scientificName;
		this.species = species;
		this.lifespan = lifespan;
		this.price = price;
		
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Integer getLifespan() {
		return lifespan;
	}

	public void setLifespan(Integer lifespan) {
		this.lifespan = lifespan;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.join("", genericName, scientificName, species, String.valueOf(lifespan), String.valueOf(price));
	}
	
}

class Plant{
	
}


