package component;

import utils.Database;
import component.CartBean;
import entities.Customer;
import entities.Item;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by SimonP on 15/03/16.
 */


@Stateless
public class CartBean{

    @EJB
    private Database memory;

    public boolean add(Customer c, Item item) {
        memory.getCarts().put(c, updateCart(c, item));
        return true;
    }

    public Set<Item> contents(Customer c) {
        return memory.getCarts().getOrDefault(c, new HashSet<Item>());
    }

    public Set<Item> updateCart(Customer c, Item item) {
        Set<Item> items = contents(c);
        Optional<Item> existing = items.stream().filter(e -> e.getForfait().equals(item.getForfait())).findFirst();
        if(existing.isPresent()) {
            items.remove(existing.get());
            Item toAdd = new Item(item.getForfait(), item.getQuantity() + existing.get().getQuantity());
            if(toAdd.getQuantity() > 0) { items.add(toAdd); }
        } else {
            items.add(item);
        }
        return items;
    }

}

