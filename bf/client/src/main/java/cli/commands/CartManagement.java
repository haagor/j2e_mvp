package cli.commands;

import api.IS3000PublicAPI;
import cli.framework.Command;
import stubs.cart.Cookies;
import stubs.cart.Item;

import java.util.List;

public abstract class CartManagement extends Command<IS3000PublicAPI> {

	protected String customerName;
	protected Item item;

	@Override
	public void load(List<String> args) {
		customerName = args.get(0);
		item = new Item();
		item.setQuantity(Integer.parseInt(args.get(1)));
		item.setCookie(Cookies.valueOf(args.get(2).toUpperCase()));
	}

}