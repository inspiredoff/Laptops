package view.command;

import view.ConsoleUI;

public class FilterLaptopBySSD extends Command {
    public FilterLaptopBySSD(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Фильтр по SSD";
    }

    @Override
    public void execute() {
        consoleUI.filterLaptopsBySSD();
    }
}
