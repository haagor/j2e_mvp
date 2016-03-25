package fr.unice.bf.isola3000.entities;

public enum Forfait {

	UN_JOUR("Une journée", 40),
	SEMAINE("Une semaine", 210);

	private String name;
	private double price;

	public double getPrice() { return price; }
	public String getName() { return name; }

	Forfait(String value, double price) {
		this.name = value;
		this.price = price;
	}

}
