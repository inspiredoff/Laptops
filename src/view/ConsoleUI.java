package view;

import java.util.Scanner;

import presenter.Presenter;

public class ConsoleUI implements View{

    private static final String INPUT_ERROR = "Вы ввели неверное значение";

    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI(MainMenu menu) {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter(this);
        this.work = true;
        this.menu = new MainMenu(this);
    }

    @Override
    public void PrintAnswer(String text) {
        System.out.println(text);        
    }

    @Override
    public void start() {
        while (work) {
            printMenu();
            execute();
        }
    }

    public void finish() {
        System.out.println("Приятно было пообщаться");
        work = false;
    }

    public void createManualLaptop(String brand,
                                    String model,
                                    String CPU,
                                    Integer RAM,
                                    Integer SSD,
                                    Integer screen,
                                    String color){
        presenter.createManualLaptop(brand,
                                        model,
                                        CPU,
                                        RAM,
                                        SSD,
                                        screen,
                                        color);
    }

    public void createRandomLaptops(){
        
    }






    private void execute(){
        String line = scanner.nextLine();
        if (
            checkTextForInt(line)){
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)){
                menu.execute(numCommand);
            }
        }
    }
    
    private boolean checkTextForInt(String text){
        if (text.matches("[0-9]+")){
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private boolean checkCommand(int numCommand){
        if (numCommand <= menu.getSize()){
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private void printMenu(){
        System.out.println(menu.menu());
    }

    private void inputError(){
        System.out.println(INPUT_ERROR);
    }

}
