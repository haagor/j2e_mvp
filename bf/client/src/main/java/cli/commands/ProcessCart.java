package cli.commands;

import api.IS3000PublicAPI;
import cli.framework.Command;

import java.util.List;

public class ProcessCart extends Command<IS3000PublicAPI> {

	private String customerName;

	@Override
	public String identifier() { return "process"; }

	@Override
	public void execute() throws Exception {
		String id = system.carts.validate(customerName);
		System.out.println("  orderId: " + id);
	}

	@Override
	public void load(List<String> args) { customerName = args.get(0); }

	@Override
	public String describe() {
		return "Process a given cart into an order (process CUSTOMER_NAME)";
	}

}
