package fr.unice.bf.isola3000.component;

import fr.unice.bf.isola3000.ICartModifier;
import fr.unice.bf.isola3000.Payment;
import fr.unice.bf.isola3000.entities.Customer;
import fr.unice.bf.isola3000.entities.Item;
import fr.unice.bf.isola3000.exceptions.PaymentException;
import fr.unice.bf.isola3000.utils.Database;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Stateless(name = "cart-stateless")
public class CartStatelessBean implements ICartModifier {

    @EJB
    private Database memory;
    @EJB
    protected Payment cashier;

   /* @Override
    //@Interceptors({CartCounter.class})
    public String validate(Customer c) throws PaymentException {
        return cashier.payOrder(c, contents(c));
    }

   /* @Override
    public boolean add(Customer c, Item item) {
        memory.getCarts().put(c, updateCart(c, item));
        return true;
    }

    @Override
    public final boolean remove(Customer c, Item item) {
        return add(c, new Item(item.getForfait(), -item.getQuantity()));
    }

    @Override
    public boolean reloadCard(String creditCard,String cardID, Item item) {
        try {
            cashier.payReloadCard(creditCard,item);
        } catch (PaymentException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean removeFromCard(String cardID) {
        return false;
    }*/

   /* @Override
    public Set<Item> contents(Customer c) {
        return memory.getCartCustomer().getOrDefault(c, new HashSet<Item>());
    }

    /**
     * Protected method to update the cart of a given customer, shared by both stateful and stateless beans
     *
    protected Set<Item> updateCart(Customer c, Item item) {
        Set<Item> items = contents(c);
        Optional<Item> existing = items.stream().filter(e -> e.getForfait().equals(item.getForfait())).findFirst();
        //la cest si on l'a deja ajouté et que on veut changer la quantité
        if (existing.isPresent()) {
            items.remove(existing.get());
            Item toAdd = new Item(item.getForfait(), item.getQuantity() + existing.get().getQuantity());
            if (toAdd.getQuantity() > 0) {
                items.add(toAdd);
            }
        } else {
            items.add(item);
        }
        return items;
    }*/

}
