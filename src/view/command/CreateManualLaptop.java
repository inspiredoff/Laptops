package view.command;

import view.ConsoleUI;

public class CreateManualLaptop extends Command {
    public CreateManualLaptop(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Создать ноутбук вручную";
    }

    @Override
    public void execute() {
        consoleUI.createManualLaptops();
    }
}
