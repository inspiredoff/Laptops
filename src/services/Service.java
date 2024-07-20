package services;

import java.util.ArrayList;

import java.util.List;

public class Service {
    private List<Models> modelsList;

    public Service() {
        modelsList = new ArrayList<>();
    }

    public Service(List<Models> modelsList) {
        this.modelsList = modelsList;
    }

    public void addModel(Models model) {
        modelsList.add(new Models(model));
    }

    public void removeModel(Models model) {
        modelsList.remove(model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Models model : modelsList) {
            sb.append("Brand : "+model.getBrand() + "\n"
                    +"Model : "+ model.getModel() + "\n"
                    +"CPU : " + model.getCPU() + "\n"
                    + "RAM : " + model.getRAM() + "\n"
                    + "SSD : " + model.getSSD() + "\n"
                    + "Screen : " + model.getScreen() + "\n"
                    + "Color : " + model.getColor()+"\n"
                    + "--------------------------------------------------"+"\n");
        };
        return sb.toString();
    }


    public List<Models> filterByBrand(String brand) {
        return modelsList.stream().filter(model -> model.getBrand().equals(brand)).toList();
    }

    public List<Models> filterByCPU(String CPU) {
        return modelsList.stream().filter(model -> model.getCPU().equals(CPU)).toList();
    }

    public List<Models> filterByColor(String color) {
        return modelsList.stream().filter(model -> model.getColor().equals(color)).toList();
    }

    public List<Models> filterByScreen(int screen) {
        return modelsList.stream().filter(model -> model.getScreen() == screen).toList();
    }

    public List<Models> filterByRAM(int RAM) {
        return modelsList.stream().filter(model -> model.getRAM() == RAM).toList();
    }

    public List<Models> filterBySSD(int SSD) {
        return modelsList.stream().filter(model -> model.getSSD() == SSD).toList();
    }
}
