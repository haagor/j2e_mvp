package fr.unice.bf.isola3000;

import fr.unice.bf.isola3000.entities.Customer;
import fr.unice.bf.isola3000.entities.Item;
import fr.unice.bf.isola3000.exceptions.PaymentException;
import fr.unice.bf.isola3000.utils.BankAPI;

import javax.ejb.Local;
import java.util.Set;

/**
 * Created by SimonP on 07/03/16.
 */


@Local
public interface Payment {


    //String payOrder(Customer c, Item item) throws PaymentException;

    boolean payReloadCard(String CardID,String creditCard,Item item) throws PaymentException;
    boolean payCardAndReload(String creditCard,Item item) throws PaymentException;

    void useBankReference(BankAPI bank);
}
