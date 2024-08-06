package service.service;

import java.util.List;

public class DatabaseParam {
    private List<String> brands;
    private List<String> models;
    private List<String> CPUs;
    private List<Integer> Rams;
    private List<Integer> SSDs;
    private List<Integer> screens;
    private List<String> colors;

    public DatabaseParam(){
        this.rndParam();
    }

    public List<String> getBrands() {
        return brands;
    }
    public void setBrands(List<String> brands) {
        this.brands = brands;
    }
    public List<String> getModels() {
        return models;
    }
    public void setModels(List<String> models) {
        this.models = models;
    }
    public List<String> getCPUs() {
        return CPUs;
    }
    public void setCPUs(List<String> cPUs) {
        CPUs = cPUs;
    }
    public List<Integer> getRams() {
        return Rams;
    }
    public void setRams(List<Integer> rams) {
        Rams = rams;
    }
    public List<Integer> getSSDs() {
        return SSDs;
    }
    public void setSSDs(List<Integer> sSDs) {
        SSDs = sSDs;
    }
    public List<Integer> getScreens() {
        return screens;
    }
    public void setScreens(List<Integer> screens) {
        this.screens = screens;
    }
    public List<String> getColor() {
        return colors;
    }
    public void setColor(List<String> colors) {
        this.colors = colors;
    }

    public void rndParam(){
        this.brands = List.of("Acer", 
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
                              "ZTE");
        this.CPUs = List.of("Intel Core i3",
                            "Intel Core i5",
                            "Intel Core i7",
                            "Intel Core i9",
                            "AMD Ryzen 3",
                            "AMD Ryzen 5",
                            "AMD Ryzen 7",
                            "AMD Ryzen 9");
        this.Rams = List.of(4, 8, 16, 32, 64);
        this.SSDs = List.of(128, 256, 512);
        this.screens = List.of(15, 16, 17, 18, 19, 20);
        this.colors = List.of("Black", "White", "Red", "Green", "Blue");
       
    }
    

    
}
