package service.service;

import service.model_laptop.Builder;
import service.model_laptop.GeneratorData;
import service.model_laptop.Laptop;

public class Director {

    private Builder builder;
    private DatabaseLaptop database;

    public Director (Builder builder) {
        this.builder = builder;
        this.database = new DatabaseLaptop();
    }

    public Laptop constructLaptop(String brand,
                                  String model,
                                  String CPU,
                                  Integer RAM,
                                  Integer SSD,
                                  Integer screen,
                                  String color) {
        Laptop laptop = builder
                .setId()
                .setBrand(brand)
                .setModel(model)
                .setCPU(CPU)
                .setRAM(RAM)
                .setSSD(SSD)
                .setScreen(screen)
                .setColor(color)
                .build();
        database.addLaptops(laptop);
        return laptop;
    }

    public void createRandomLaptops(int length) {
        
        for (int i = 0; i< length; i++) {
             Laptop laptop = constructLaptop(
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getBrands()),
                                GeneratorData.createRndModel(10), 
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getCPUs()),
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getRams()),
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getSSDs()),
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getScreens()),
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getColor())
                            );
//             this.database.addLaptops(laptop);
//                        );
        }
    }

    public DatabaseLaptop getDatabase() {
        return database;
    }
}