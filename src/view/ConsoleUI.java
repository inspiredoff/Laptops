package view;

import java.util.Scanner;

import presenter.Presenter;

public class ConsoleUI implements View{

    private static final String INPUT_ERROR = "Вы ввели неверное значение";

    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
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
        System.out.println("Сколько ноутбуков создать?");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Создаем " + length + " ноутбуков");
        presenter.createRandomLaptops(length);
    }

    public void printLaptops(){
        presenter.printLaptops();
    }

    public void getFilteredLaptops(){
        presenter.getFilteredLaptops();
    }

    public void refreshFilters(){
        presenter.refreshFilters();
    }

    public void createManualLaptops(){
        System.out.println("Введите бренд ноутбука?");
        String brand = scanner.nextLine();
        System.out.println("Введите модель ноутбука?");
        String model = scanner.nextLine();
        System.out.println("Введите CPU ноутбука?");
        String CPU = scanner.nextLine();
        System.out.println("Введите RAM ноутбука?");
        String RAMstring = scanner.nextLine();
        int RAM = Integer.parseInt(RAMstring);
        System.out.println("Введите SSD ноутбука?");
        String SSDstring = scanner.nextLine();
        int SSD = Integer.parseInt(SSDstring);
        System.out.println("Введите экран ноутбука?");
        String screenstring = scanner.nextLine();
        int screen = Integer.parseInt(screenstring);
        System.out.println("Введите цвет ноутбука?");
        String color = scanner.nextLine();
        presenter.createManualLaptop(brand, model, CPU, RAM, SSD, screen, color);
    }

    public void filterLaptopsByBrand(){
        System.out.println("Введите бренд ноутбука?");
        String brand = scanner.nextLine();
        presenter.filterLaptopsByBrand(brand);
    }

    public void filterLaptopsByColor(){
        System.out.println("Введите цвет ноутбука?");
        String color = scanner.nextLine();
        presenter.filterLaptopsByColor(color);
    }

    public void filterLaptopsByCPU(){
        System.out.println("Введите CPU ноутбука?");
        String CPU = scanner.nextLine();
        presenter.filterLaptopsByCPU(CPU);
    }

    public void filterLaptopsBySSD(){
        System.out.println("Введите SSD ноутбука?");
        String SSDstring = scanner.nextLine();
        int SSD = Integer.parseInt(SSDstring);
        presenter.filterLaptopsBySSD(SSD);
    }

    public void filterLaptopsByRAM(){
        System.out.println("Введите RAM ноутбука?");
        String RAMstring = scanner.nextLine();
        int RAM = Integer.parseInt(RAMstring);
        presenter.filterLaptopsByRAM(RAM);
    }


    public void filterLaptopsByScreen(){
        System.out.println("Введите экран ноутбука?");
        String screenstring = scanner.nextLine();
        int screen = Integer.parseInt(screenstring);
        presenter.filterLaptopsByScreen(screen);
    }

    private void execute(){
        String line = scanner.nextLine();
        if (
            checkTextForInt(line)){
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)){
                System.out.println("\033[2J");
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
