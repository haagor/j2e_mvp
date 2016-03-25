package fr.unice.bf.isola3000.webservice;

import fr.unice.bf.isola3000.component.CashierBean;
import fr.unice.bf.isola3000.entities.Item;
import fr.unice.bf.isola3000.exceptions.PaymentException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Created by user on 22/03/2016.
 */
@WebService(targetNamespace = "http://localhost:8080/isa/bf/cashier")
@Stateless(name = "CashierWS")
public class CashierWebServiceImpl implements ICashierWebService {

    @EJB
    private CashierBean cashier;

    @Override
    public boolean payCardAndReload(String creditCard, Item item) throws PaymentException {
        return cashier.payCardAndReload(creditCard, item);
    }

    @Override
    public boolean payReloadCard(String cardID, String creditCard, Item item) throws PaymentException {
        return cashier.payReloadCard(cardID, creditCard, item);
    }
}
