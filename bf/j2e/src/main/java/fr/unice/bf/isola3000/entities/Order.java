package fr.unice.bf.isola3000.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

public class Order implements Serializable {

    private String id;
    private Customer customer;
    private Set<Item> items;
    private String cardID;
    private boolean cardOnly;

    public Order(Customer customer, Set<Item> items) {
        this.customer = customer;
        this.items = items;
        this.id = UUID.randomUUID().toString();
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Set<Item> getItems() {
        return items;
    }

    public double getPrice() {
        double result = 0.0;
        for (Item item : items) {
            result += (item.getForfait().getPrice());
        }
        return result;
    }

    public boolean isCardOnly() {
        return cardOnly;
    }

    public void setCardOnly(boolean cardOnly) {
        this.cardOnly = cardOnly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        return !(items != null ? !items.equals(order.items) : order.items != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }
}
