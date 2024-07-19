import java.util.ArrayList;
import java.util.List;

import services.Service;
import services.Models;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Models> models = testcase();
        for (Models model : models) {
            System.out.println(model.getBrand() + " " + model.getModel() + " " + model.getCPU() + " " + model.getRAM() + " " + model.getSSD() + " " + model.getScreen() + " " + model.getColor());
        }

    }

    public static List<Models> testcase() {

        List<String> brands = new ArrayList<>();
        brands.add("Acer");
        brands.add("Apple");
        brands.add("Asus");
        brands.add("Dell");
        brands.add("HP");
        brands.add("Lenovo");
        brands.add("LG");
        brands.add("MSI");
        brands.add("Samsung");
        brands.add("Toshiba");
        brands.add("Xiaomi");
        brands.add("ZTE");

        List<String> CPUs = new ArrayList<>();
        CPUs.add("Intel Core i3");
        CPUs.add("Intel Core i5");
        CPUs.add("Intel Core i7");
        CPUs.add("Intel Core i9");
        CPUs.add("AMD Ryzen 3");
        CPUs.add("AMD Ryzen 5");
        CPUs.add("AMD Ryzen 7");
        CPUs.add("AMD Ryzen 9");

        List<Integer> RAMs = new ArrayList<>();
        RAMs.add(4);
        RAMs.add(8);
        RAMs.add(16);
        RAMs.add(32);
        RAMs.add(64);
        RAMs.add(128);
        RAMs.add(256);
        RAMs.add(512);

        List<Integer> screens = new ArrayList<>();
        screens.add(13);
        screens.add(14);
        screens.add(15);
        screens.add(16);
        screens.add(17);

        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Silver");
        colors.add("Gold");
        colors.add("White");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Purple");
        colors.add("Orange");
        colors.add("Yellow");

        List<Integer> SSDs = new ArrayList<>();
        SSDs.add(256);
        SSDs.add(512);
        SSDs.add(1024);
        SSDs.add(2048);
        SSDs.add(4096);

        Service services = new Service();
        services.addModel(new Models(services.addRandomModel(brands, CPUs, RAMs, SSDs, screens, colors)));

        return services.getModelsList();
}

}