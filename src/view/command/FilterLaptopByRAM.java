package view.command;

import view.ConsoleUI;

public class FilterLaptopByRAM extends Command {
    public FilterLaptopByRAM(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Фильтровать ноутбуки по объему оперативной памяти";
    }

    @Override
    public void execute() {
        consoleUI.filterLaptopsByRAM();
    }
}
