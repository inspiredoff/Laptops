import model_laptop.Director;
import model_laptop.LaptopBuilder;
import model_laptop.Model;

import services.Service;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LaptopBuilder builder = new LaptopBuilder();
        Service service = new Service();
        Director.constructLaptop(builder, "Acer", "Predator", "Intel Core i7", 16, 512, 15, "Black");
        Model laptop = builder.build();
        service.addModel(laptop);

        for (int i = 0; i < 10; i++) {
            Director.constructLaptopRandom(builder,
                    List.of("Acer",
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
                            "ZTE"),
                    List.of("Intel Core i3",
                            "Intel Core i5",
                            "Intel Core i7",
                            "Intel Core i9",
                            "AMD Ryzen 3",
                            "AMD Ryzen 5",
                            "AMD Ryzen 7",
                            "AMD Ryzen 9"),
                    List.of(4, 8, 16, 32, 64),
                    List.of(128, 256, 512),
                    List.of(15, 16, 17, 18, 19, 20),
                    List.of("Black", "White", "Red", "Green", "Blue"),
                    10
            );
            Model laptopRandom = builder.build();
            service.addModel(laptopRandom);
        }

        System.out.println(service);

//        Service filter = new Service(service.);
    }

}
