package utils;

import entities.Forfaits;

import javax.ejb.Singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Singleton
public class Database {

	private Map<Forfaits, Integer> cards;
	public Map<Forfaits, Integer> getCarts() { return cards; }

	public Database() {
		flush();
	}

	public void flush() {
		cards = new HashMap<>();
	}

}
