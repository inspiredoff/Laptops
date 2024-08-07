package view.command;

import view.ConsoleUI;

public class FilterLaptopByBrand extends Command {
    public FilterLaptopByBrand(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Фильтрация ноутбуков по бренду";
    }

    @Override
    public void execute() {
        consoleUI.filterLaptopsByBrand();
    }
}
