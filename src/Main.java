import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import services.Service;
import services.Models;
import services.CreateModels;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Models> modelsList = createModel(10);
        Service Laptop = new Service(modelsList);
        System.out.println(Laptop);

    }

    public static List<Models> createModel(int quantity) {
        List<String> brands = new ArrayList<>();
        brands.addAll(Arrays.asList(
                "Acer",
                "Apple",
                "Asus",
                "Dell",
                "HP",
                "Lenovo",
                "LG",
                "msi",
                "Samsung",
                "Toshiba",
                "Xiaomi",
                "ZTE"
        ));

        List<String> CPUs = new ArrayList<>();
        CPUs.addAll(Arrays.asList(
                "Intel Core i3",
                "Intel Core i5",
                "Intel Core i7",
                "Intel Core i9",
                "AMD Ryzen 3",
                "AMD Ryzen 5",
                "AMD Ryzen 7",
                "AMD Ryzen 9"
        ));

        List<Integer> RAMs = new ArrayList<>();
        RAMs.addAll(Arrays.asList(
                4,
                8,
                16,
                32,
                64,
                128,
                256,
                512
        ));

        List<Integer> screens = new ArrayList<>();
        screens.addAll(Arrays.asList(
                13,
                14,
                15,
                16,
                17
        ));

        List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList(
                "Black",
                "Silver",
                "Gold",
                "White",
                "Blue",
                "Red",
                "Green",
                "Purple",
                "Orange",
                "Yellow"
        ));

        List<Integer> SSDs = new ArrayList<>();
        SSDs.addAll(Arrays.asList(
                128,
                256,
                512,
                1024,
                2048
        ));

        List<Models> laptops = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            laptops.add(new CreateModels().addRandomModel(brands, CPUs, RAMs, SSDs, screens, colors));
        }
        return laptops;
    }
}