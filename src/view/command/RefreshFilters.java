package view.command;

import view.ConsoleUI;

public class RefreshFilters extends Command{
	public RefreshFilters(ConsoleUI consoleUI){
		super(consoleUI);
		description = "Refresh All filters";
	}


	@Override
	public void execute() {
		consoleUI.refreshFilters();
	}

}
