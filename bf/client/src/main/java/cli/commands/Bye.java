package cli.commands;

import api.PublicAPI;
import cli.framework.Command;

public class Bye extends Command<PublicAPI> {

	@Override
	public String identifier() { return "bye"; }

	@Override
	public void execute() { }

	@Override
	public String describe() {
		return "Exit ski3000";
	}

	@Override
	public boolean shouldContinue() { return false; }

}
