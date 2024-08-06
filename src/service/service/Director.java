package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model_laptop.Builder;
import model_laptop.GeneratorData;
import model_laptop.Laptop;

public class Director {

    private Builder builder;
    private Database database;

    public Director (Builder builder) {
        this.builder = builder;
        


    }

    public Laptop constructLaptop(String brand,
                                String model,
                                String CPU,
                                Integer RAM,
                                Integer SSD,
                                Integer screen,
                                String color) {
        return builder
                .setId()
                .setBrand(brand)
                .setModel(model)
                .setCPU(CPU)
                .setRAM(RAM)
                .setSSD(SSD)
                .setScreen(screen)
                .setColor(color)
                .build();
    }

    public void createRandomLaptops(int length) {
        
        for (int i = 0; i< length; i++) {
            database.addLaptops(constructLaptop(
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getBrands()),
                                GeneratorData.createRndModel(10), 
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getCPUs()),
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getRams()),
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getSSDs()),
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getScreens()),
                                GeneratorData.rndChoiseElemList(new DatabaseParam().getColor())
                            )
                        );
        }
    }
}