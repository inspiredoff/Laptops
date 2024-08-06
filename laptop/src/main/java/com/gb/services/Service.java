package services;

import model_laptop.Model;

import java.util.ArrayList;
import java.util.List;



public class Service {
    private int models_id;
    private List<Model> modelsList;

    public Service() {
        modelsList = new ArrayList<>();
    }


    public void addModel(Model model) {
        modelsList.add(model);
    }

    public void removeModel(Model model) {
        modelsList.remove(model);
    }


    public String toString(Model model) {
        return "id : " + model.getId() + "\n" +
                "Brand : "+model.getBrand() + "\n"
                +"model_laptop.Model : "+ model.getModel() + "\n"
                +"CPU : " + model.getCPU() + "\n"
                + "RAM : " + model.getRAM() + "\n"
                + "SSD : " + model.getSSD() + "\n"
                + "Screen : " + model.getScreen() + "\n"
                + "Color : " + model.getColor()+"\n"
                + "--------------------------------------------------"+"\n";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Model model : modelsList) {
            sb.append("id : " + model.getId() + "\n" +
                    "Brand : "+model.getBrand() + "\n"
                    +"model_laptop.Model : "+ model.getModel() + "\n"
                    +"CPU : " + model.getCPU() + "\n"
                    + "RAM : " + model.getRAM() + "\n"
                    + "SSD : " + model.getSSD() + "\n"
                    + "Screen : " + model.getScreen() + "\n"
                    + "Color : " + model.getColor()+"\n"
                    + "--------------------------------------------------"+"\n");
        };
        return sb.toString();
    }


    public Model getModel(int id) {
        return modelsList.stream().filter(model -> model.getId() == id).findFirst().orElse(null);
    }

    public List<Model> filterByBrand(String brand) {
        return modelsList.stream().filter(model -> model.getBrand().equals(brand)).toList();
    }

    public List<Model> filterByCPU(String CPU) {
        return modelsList.stream().filter(model -> model.getCPU().equals(CPU)).toList();
    }

    public List<Model> filterByColor(String color) {
        return modelsList.stream().filter(model -> model.getColor().equals(color)).toList();
    }

    public List<Model> filterByScreen(int screen) {
        return modelsList.stream().filter(model -> model.getScreen() == screen).toList();
    }

    public List<Model> filterByRAM(int RAM) {
        return modelsList.stream().filter(model -> model.getRAM() == RAM).toList();
    }

    public List<Model> filterBySSD(int SSD) {
        return modelsList.stream().filter(model -> model.getSSD() == SSD).toList();
    }
}
