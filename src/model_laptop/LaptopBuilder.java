package model_laptop;

import services.Service;

public class LaptopBuilder implements Builder {
    private int id;
    private String brand;
    private String model;
    private String CPU;
    private int RAM;
    private int SSD;
    private int screen;
    private String color;

    @Override
    public Builder setId() {
        this.id++;
        return this;
    }

    @Override
    public Builder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Builder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public Builder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    @Override
    public Builder setSSD(int SSD) {
        this.SSD = SSD;
        return this;
    }

    @Override
    public Builder setScreen(int screen) {
        this.screen = screen;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Model build() {
//        Service service = new Service();
        Model laptop = new Model(brand, model, CPU, RAM, SSD, screen, color);
        laptop.setId(id);
//        service.addModel(laptop);
        return laptop;
    }

}