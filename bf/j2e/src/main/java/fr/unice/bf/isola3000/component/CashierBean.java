package fr.unice.bf.isola3000.component;

import fr.unice.bf.isola3000.entities.Customer;
import fr.unice.bf.isola3000.entities.Item;
import fr.unice.bf.isola3000.exceptions.ExternalPartnerException;
import fr.unice.bf.isola3000.exceptions.PaymentException;
import fr.unice.bf.isola3000.utils.BankAPI;
import fr.unice.bf.isola3000.utils.Database;
import fr.unice.bf.isola3000.Payment;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created by SimonP on 07/03/16.
 */


@Stateless
public class CashierBean implements Payment {

    @EJB
    private Database memory;

    @EJB
    private CardRegister cardRegister;

    private BankAPI bank;

    /**
     * Lance le paiement du rechargement de la carte + le prix de la nouvelle carte Cim demandée
     * @param creditCard
     * @param item
     * @return
     * @throws PaymentException
     */
    @Override
    public boolean payCardAndReload(String creditCard, Item item) throws PaymentException {
       if(payForfait(creditCard,item,true)){
           //on passe à l'ajout du forfait dans la carte créée
           cardRegister.addCardInRegistry(item);
           return true;
       }
        return false;
    }

    /**
     * Lance le paiement du forfait et le rechargement de la carte
     * @param creditCard
     * @param item
     * @return
     * @throws PaymentException
     */
    @Override
    public boolean payReloadCard(String cardID,String creditCard, Item item) throws PaymentException {
        if(payForfait(creditCard,item, false)){
            //on passe à l'ajout du forfait dans la carte créée
            cardRegister.addForfaitToCard(Integer.parseInt(cardID),item);
            return true;
        }
        return false;
    }

    private boolean payForfait(String creditCard, Item item, boolean withCard)throws PaymentException{
        boolean status = false;
        double price = item.getForfait().getPrice();
        if(withCard)
            price += 1.50;
        try {
            status = bank.performPaymentReloadCard(creditCard, price);
        } catch (ExternalPartnerException e) {
            e.printStackTrace();
        }

        if (!status) {
            throw new PaymentException(creditCard, price);
        }
        return false;
    }

    public void useBankReference(BankAPI bank) {
        this.bank = bank;
    }


    /*@Override
    public String payOrder(Customer customer, Item item) throws PaymentException {

        Order order = new Order(customer, item);
        double price = order.getPrice();

        boolean status = false;
        try { status = bank.performPayment(customer, price); }
        catch (ExternalPartnerException e) {
            throw new PaymentException(customer.getName(), price);
        }

        if (!status) {
            throw new PaymentException(customer.getName(), price);
        }

        customer.add(order);
        memory.getOrders().put(order.getId(),order);
        //kitchen.process(order);

        return order.getId();
    }*/

    @PostConstruct
    private void initializeRestPartnership() throws IOException {
        Properties prop = new Properties();
        prop.load(this.getClass().getResourceAsStream("/bank.properties"));
        bank = new BankAPI(prop.getProperty("bankHostName"),
                prop.getProperty("bankPortNumber"));
    }


}
