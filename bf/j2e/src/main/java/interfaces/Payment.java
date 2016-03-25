package interfaces;

import entities.Purchase;
import exceptions.PaymentException;
import utils.BankAPI;

import javax.ejb.Local;

@Local
public interface Payment {

	void payOrder(Purchase purchase) throws PaymentException ;

	void useBankReference(BankAPI bank);
}
