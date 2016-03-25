/*package fr.unice.bf.isola3000.webservice;

import fr.unice.bf.isola3000.entities.Forfait;
import fr.unice.bf.isola3000.exceptions.PaymentException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Set;

@WebService
public interface ICartWebService {

	@WebMethod
	//@Interceptors({ItemVerifier.class})
	void addItemToCustomerCart(@WebParam(name = "customer_name") String customerName,
							   @WebParam(name = "item") Forfait it);

	@WebMethod
	//@Interceptors({ItemVerifier.class})
	void removeItemToCustomerCart(@WebParam(name = "customer_name") String customerName,
								  @WebParam(name = "item") Forfait it);

	@WebMethod
	@WebResult(name = "cart_contents")
	Set<Forfait> getCustomerCartContents(@WebParam(name = "customer_name") String customerName);

	@WebMethod
	@WebResult(name = "order_id")
	String validate(@WebParam(name = "customer_name") String customerName)
			throws PaymentException;

	@WebMethod


}*/
