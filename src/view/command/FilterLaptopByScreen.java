package view.command;

import view.ConsoleUI;

public class FilterLaptopByScreen extends Command {
    public FilterLaptopByScreen(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отфильтровать ноутбуки по разрешению экрана";
    }

    @Override
    public void execute() {
        consoleUI.filterLaptopsByScreen();
    }
}
