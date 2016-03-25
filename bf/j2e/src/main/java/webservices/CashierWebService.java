package webservices;

import exceptions.PaymentException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface CashierWebService {

	@WebMethod
	@WebResult(name = "paye") // utilise si return autre chose que void
	void paye(@WebParam(name = "forfait") String forfait,
			  @WebParam(name = "creditCard") String creditCard) throws PaymentException;

	@WebMethod
	void test();

}
