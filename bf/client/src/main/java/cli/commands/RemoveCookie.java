package cli.commands;

public class RemoveCookie extends CartManagement {

	@Override
	public String identifier() { return "remove"; }

	@Override
	public void execute() throws Exception {
		system.carts.removeItemToCustomerCart(customerName, item);
	}

	@Override
	public String describe() {
		return "Remove some cookies for a given customer (remove CUSTOMER QUANTITY RECIPE)";
	}
}
