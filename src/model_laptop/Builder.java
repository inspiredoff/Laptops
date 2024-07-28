package model_laptop;

public interface Builder {

    public Builder setId();

    Builder setBrand(String brand);

    Builder setModel(String model);

    Builder setCPU(String CPU);

    Builder setRAM(int RAM);

    Builder setSSD(int SSD);

    Builder setScreen(int screen);

    Builder setColor(String color);

    public Model build();
}
