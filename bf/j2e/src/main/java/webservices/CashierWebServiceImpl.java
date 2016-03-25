package webservices;
import entities.Forfaits;
import entities.Purchase;
import exceptions.PaymentException;
import interfaces.Payment;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;


@WebService(targetNamespace = "http://polytech.unice.fr/si/4a/isa/bf")
@Stateless(name = "CashierWS")
public class CashierWebServiceImpl implements CashierWebService {


	@EJB private Payment payment;

	@Override
	public void paye(String forfait, String creditCard) throws PaymentException {
		Purchase tps = new Purchase(Forfaits.RICHOU, creditCard /*"1234-567890"*/ );
		payment.payOrder(tps);
	}

	@Override
	public void test() {
		System.out.println("BITE");
	}

}
