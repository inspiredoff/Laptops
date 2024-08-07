package view.command;

import view.ConsoleUI;

public class printLaptops extends Command {
    public printLaptops(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Вывести список ноутбуков";
    }
    @Override
    public void execute() {
        consoleUI.printLaptops();
    }
}
