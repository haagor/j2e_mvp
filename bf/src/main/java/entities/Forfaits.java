package entities;

public enum Forfaits {

	RICHOU("Chocolalala", 10.0);

	private String name;
	private double price;

	public double getPrice() { return price; }
	public String getName() { return name; }

	Forfaits(String value, double price) {
		this.name = value;
		this.price = price;
	}

}
