package model_laptop;

public class Model {

    private int id;
    private String brand;
    private String model;
    private String CPU;
    private int RAM;
    private int SSD;
    private int screen;
    private String color;


    public Model(String brand, String model, String CPU, int RAM, int SSD, int screen, String color) {
        this.brand = brand;
        this.model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
        this.screen = screen;
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public int getScreen() {
        return screen;
    }

    public String getColor() {
        return color;
    }
}

