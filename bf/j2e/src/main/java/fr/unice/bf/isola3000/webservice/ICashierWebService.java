package fr.unice.bf.isola3000.webservice;

import fr.unice.bf.isola3000.entities.Item;
import fr.unice.bf.isola3000.exceptions.PaymentException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by user on 22/03/2016.
 */

@WebService
public interface ICashierWebService {

    @WebMethod
    boolean payCardAndReload(@WebParam(name = "credit_card_number") String creditCard,
                             @WebParam(name = "forfait") Item item)
            throws PaymentException;

    @WebMethod
    boolean payReloadCard(@WebParam(name = "card_id") String cardID,
                          @WebParam(name = "credit_card_number") String creditCard,
                          @WebParam(name = "forfait") Item item)
            throws PaymentException;
}
