package components;

import entities.Purchase;
import interfaces.Payment;
import exceptions.PaymentException;
import utils.BankAPI;
import utils.Database;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.IOException;
import java.util.Properties;

@Stateless
public class CashierBean implements Payment {

//	@EJB
//	private OrderProcessing kitchen;

	@EJB
	private Database memory;

	private BankAPI bank;
	public void useBankReference(BankAPI bank) { this.bank = bank; }

	@Override
	public void payOrder(Purchase purchase) throws PaymentException {

		double price = purchase.getForfait().getPrice();
		System.out.println("la caisse a reçu " + price + " euros");
		bank.performPayment(purchase.getCreditCard(), price);

//		memory.getOrders().put(order.getId(),order);
//		kitchen.process(order);

	}

	@PostConstruct
	private void initializeRestPartnership() throws IOException {
		Properties prop = new Properties();
		prop.load(this.getClass().getResourceAsStream("/bank.properties"));
		bank = new BankAPI(	prop.getProperty("bankHostName"),
							prop.getProperty("bankPortNumber"));
	}

}
