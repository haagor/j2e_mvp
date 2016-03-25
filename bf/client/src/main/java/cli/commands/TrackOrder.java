package cli.commands;

import api.IS3000PublicAPI;
import cli.framework.Command;

import java.util.List;

public class TrackOrder extends Command<IS3000PublicAPI> {

	private String orderId;

	@Override
	public String identifier() { return "track"; }

	@Override
	public void execute() throws Exception {
		//OrderStatus status = system.ccs.track(orderId);
		//System.out.println("  Status: " + status);
	}

	@Override
	public void load(List<String> args) { orderId = args.get(0); }

	@Override
	public String describe() {
		return "track order status (track ORDER_ID)";
	}

}
