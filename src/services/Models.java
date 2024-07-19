package services;

public class Models {

    private int id = 0;
    private String brand;
    private String model;
    private String CPU;
    private int RAM;
    private int SSD;
    private int screen;
    private String color;


    public Models(String brand, String model, String CPU, int RAM, int SSD, int screen, String color) {
        this.id++;
        this.brand = brand;
        this.model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
        this.screen = screen;
        this.color = color;
    }

    public Models(Models models) {
        this.id = models.id;
        this.brand = models.brand;
        this.model = models.model;
        this.CPU = models.CPU;
        this.RAM = models.RAM;
        this.SSD = models.SSD;
        this.screen = models.screen;
        this.color = models.color;
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

