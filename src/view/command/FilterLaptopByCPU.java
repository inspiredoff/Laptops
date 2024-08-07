package view.command;

import view.ConsoleUI;

public class FilterLaptopByCPU extends Command {
    public FilterLaptopByCPU(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Фильтровать ноутбуки по процессору";
    }

    @Override
    public void execute() {
        consoleUI.filterLaptopsByCPU();
    }
}
