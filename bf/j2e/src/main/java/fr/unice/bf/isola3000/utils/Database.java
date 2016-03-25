package fr.unice.bf.isola3000.utils;

import fr.unice.bf.isola3000.entities.*;

import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by SimonP on 03/03/16.
 */

@Singleton
public class Database {

    public int cardID = 0;
    public int getCardID() { return cardID; }
    public void setCardID(int newID) { cardID = newID; }

    public Map<Integer,Gate> gates;
    public Map<Integer,Gate> getGates() { return gates; }

    public Map<Integer,Item> cards;

    public Map<Integer,Item> getCards() {
        return cards;
    }

    /*private Map<Customer, Set<Item>> carts;

    public Map<Customer, Set<Item>> getCarts() {
        return carts;
    }


    private Map<String, Customer> customers;

    public Map<String, Customer> getCustomers() {
        return customers;
    }*/

    public Database() {
        flush();
        for (int i = 0; i < 20; i++) {
            if (i < 5)
                gates.put(i,new Gate(AreaEnum.SNOW_PARK));
            else if (i < 15)
                gates.put(i,new Gate(AreaEnum.BEGINNER));
            else
                new Gate(AreaEnum.PRO);
        }
    }

    public void flush() {
        cards = new HashMap<>();
        //customers = new HashMap<>();
        //carts = new HashMap<>();
    }

}
