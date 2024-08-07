package view.command;

import view.ConsoleUI;

public class CreateRandomLaptops extends Command {
    public CreateRandomLaptops(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Создать случайные ноутбуки";
    }

    @Override
    public void execute() {
        consoleUI.createRandomLaptops();
    }
}
