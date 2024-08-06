import service.service.Service;

 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.createRandomLaptops();
        service.printLaptop();





        // LaptopBuilder builder = new LaptopBuilder();
        // Director director = new Director(builder);
        // LaptopFilterService service = new LaptopFilterService();
        // Laptop laptop = director.constructLaptop("Acer", "Predator", "Intel Core i7", 16, 512, 15, "Black");
        // service.addModel(laptop);

        // List<Laptop> laptops = director.createRandomLaptops(
        //             List.of("Acer",
        //                     "Apple",
        //                     "Asus",
        //                     "Dell",
        //                     "HP",
        //                     "Lenovo",
        //                     "LG",
        //                     "msi",
        //                     "Samsung",
        //                     "Toshiba",
        //                     "Xiaomi",
        //                     "ZTE"),
        //             List.of("Intel Core i3",
        //                     "Intel Core i5",
        //                     "Intel Core i7",
        //                     "Intel Core i9",
        //                     "AMD Ryzen 3",
        //                     "AMD Ryzen 5",
        //                     "AMD Ryzen 7",
        //                     "AMD Ryzen 9"),
        //             List.of(4, 8, 16, 32, 64),
        //             List.of(128, 256, 512),
        //             List.of(15, 16, 17, 18, 19, 20),
        //             List.of("Black", "White", "Red", "Green", "Blue"),
        //             10
        //     );
        //     for (Laptop rnd_laptop : laptops){
        //         service.addModel(rnd_laptop);
        //     }

        //     var filteredModels = service.filterByBrand("Asus", "LG")
        //     .filterByRAM(8)
        //     .getFilteredModels();
        //     System.out.println(filteredModels);

        //     service.refresh();
//        Service filter = new Service(service.);
    }

}
