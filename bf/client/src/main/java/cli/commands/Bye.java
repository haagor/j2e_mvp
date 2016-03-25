package cli.commands;

import api.IS3000PublicAPI;
import cli.framework.Command;

public class Bye extends Command<IS3000PublicAPI> {

	@Override
	public String identifier() { return "bye"; }

	@Override
	public void execute() { }

	@Override
	public String describe() {
		return "Exit Cookie on Demand";
	}

	@Override
	public boolean shouldContinue() { return false; }

}
