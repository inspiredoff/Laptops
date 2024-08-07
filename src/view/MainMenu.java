package view;

import view.command.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new CreateManualLaptop(consoleUI));
        commandList.add(new CreateRandomLaptops(consoleUI));
        commandList.add(new FilterLaptopByBrand(consoleUI));
        commandList.add(new FilterLaptopByCPU(consoleUI));
        commandList.add(new FilterLaptopByScreen (consoleUI));
        commandList.add(new FilterLaptopByRAM(consoleUI));
        commandList.add(new FilterLaptopBySSD(consoleUI));
        commandList.add(new FilterLaptopByColor(consoleUI));
    }

    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice){
        Command command = commandList.get(choice-1);
        command.execute();
    }

    public int getSize(){
        return commandList.size();
    }
}
