/*package fr.unice.bf.isola3000.webservice;

import fr.unice.bf.isola3000.entities.Forfait;
import stubs.customerCare.AlreadyExistingCustomerException;
import stubs.customerCare.OrderStatus;
import stubs.customerCare.UnknownOrderId;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Set;

@WebService
public interface CustomerCareService {

	@WebMethod
	void register(@WebParam(name = "customer_name") String name,
				  @WebParam(name = "credit_card_number") String creditCard)
			throws AlreadyExistingCustomerException;


	@WebMethod
	@WebResult(name = "status")
	OrderStatus track(@WebParam(name = "order_id") String orderId)
		throws UnknownOrderId;

	@WebMethod
	@WebResult(name = "recipes")
	Set<Forfait> listAllRecipes();

}*/
