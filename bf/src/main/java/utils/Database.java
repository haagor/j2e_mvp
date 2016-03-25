package utils;

import entities.Customer;
import entities.Item;
import entities.Order;

import javax.ejb.Singleton;
import javax.validation.constraints.AssertFalse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by SimonP on 15/03/16.
 */

@Singleton
public class Database {

    private Map<Customer, Set<Item>> carts;
    public Map<Customer, Set<Item>> getCarts() { return carts; }

    private Map<String, Customer> customers;
    public Map<String, Customer> getCustomers() { return customers; }

    private Map<String, Order> orders;
    public Map<String, Order> getOrders() { return orders; }

    public Database() {
        flush();
    }

    public void flush() {
        carts = new HashMap<>();
        customers = new HashMap<>();
        orders = new HashMap<>();
    }
}
