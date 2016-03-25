package webservice;

import entities.Customer;
import entities.Item;
//import exceptions.PaymentException;
import utils.BankAPI;

import javax.ejb.Local;
import java.util.Set;

@Local
public interface Payment {

    String payOrder(Customer customer, Set<Item> items) /*throws PaymentException*/ ;

    void useBankReference(BankAPI bank);
}
