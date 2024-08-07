package view.command;

import view.ConsoleUI;

public class FilterLaptopByColor extends Command {
    public FilterLaptopByColor(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Фильтровать ноутбуки по цвету";
    }

    @Override
    public void execute() {
        consoleUI.filterLaptopsByColor();
    }
}
