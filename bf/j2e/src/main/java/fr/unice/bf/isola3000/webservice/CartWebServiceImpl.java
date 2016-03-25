/*package fr.unice.bf.isola3000.webservice;

import fr.unice.bf.isola3000.CustomerFinder;
import fr.unice.bf.isola3000.ICartModifier;
import fr.unice.bf.isola3000.entities.Customer;
import fr.unice.bf.isola3000.entities.Item;
import fr.unice.bf.isola3000.exceptions.PaymentException;
import fr.unice.bf.isola3000.exceptions.UnknownCustomerException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.Optional;
import java.util.Set;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/tcf/cart")
@Stateless(name = "CartWS")
public class CartWebServiceImpl implements ICartWebService {

	@EJB(name="stateless-cart") private ICartModifier cart;


	@EJB
	private CustomerFinder finder;

	@Override
	public void addItemToCustomerCart(String customerName, Item it)
			throws UnknownCustomerException {
		cart.add(readCustomer(customerName), it);
	}

	@Override
	public void removeItemToCustomerCart(String customerName, Item it)
			throws UnknownCustomerException {
		cart.remove(readCustomer(customerName), it);
	}

	@Override
	public Set<Item> getCustomerCartContents(String customerName)
			throws UnknownCustomerException {
		return cart.contents(readCustomer(customerName));
	}

	@Override
	public String validate(String customerName)
			throws PaymentException, UnknownCustomerException {
		return cart.validate(readCustomer(customerName));
	}

	private Customer readCustomer(String customerName)
			throws UnknownCustomerException {
		Optional<Customer> c = finder.findByName(customerName);
		if(!c.isPresent())
			throw new UnknownCustomerException(customerName);
		return c.get();
	}

}*/
