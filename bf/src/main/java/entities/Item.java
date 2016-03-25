package entities;

import java.io.Serializable;

public class Item implements Serializable {

	private Forfaits forfait;
	private int quantity;

	public Item() {}

	public Item(Forfaits forfait, int quantity) {
		this.forfait = forfait;
		this.quantity = quantity;
	}


	public Forfaits getForfait() {
		return forfait;
	}
	public void setForfait(Forfaits cookie) {
		this.forfait = forfait;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() { return quantity + "x" + forfait.toString(); }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Item)) return false;
		Item item = (Item) o;
		if (getQuantity() != item.getQuantity()) return false;
		return getForfait() == item.getForfait();

	}

	@Override
	public int hashCode() {
		int result = getForfait().hashCode();
		result = 31 * result + getQuantity();
		return result;
	}
}
