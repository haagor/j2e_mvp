package fr.unice.bf.isola3000.entities;

import java.io.Serializable;

public class Item implements Serializable {

	private Forfait forfait;
	private AreaEnum zone;

	public Item() {}

	public Item(Forfait forfait, AreaEnum zone) {
		this.forfait = forfait;
		this.zone = zone;
	}


	public Forfait getForfait() {
		return forfait;
	}
	public AreaEnum getZone() { return zone; }
	public void setForfait(Forfait forfait) {
		this.forfait = forfait;
	}
	public void setZone(AreaEnum zone) { this.zone = zone; }


}
