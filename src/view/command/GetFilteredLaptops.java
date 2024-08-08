package view.command;

import view.ConsoleUI;

public class GetFilteredLaptops extends Command{

	public GetFilteredLaptops(ConsoleUI consoleUI){
		super(consoleUI);
		description = "print flltered laptops";
	}

	@Override
	public void execute() {
		consoleUI.getFilteredLaptops();
	}

	

}
