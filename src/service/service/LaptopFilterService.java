package service.service;

import service.model_laptop.Laptop;

import java.util.ArrayList;
import java.util.List;




public class LaptopFilterService {
    private List<Laptop> initialList;
    private List<Laptop> filteredList;

    
    public LaptopFilterService(DatabaseLaptop database) {
        initialList = database.getLaptops();
        filteredList = new ArrayList<>();
    }

    public void refresh() {
        filteredList = new ArrayList<>();
    }
    
    public List<Laptop> getInitialModels(){
        return initialList;
    } 

    public List<Laptop> getFilteredModels() {
        return filteredList;
    }

    public Laptop getModel(int id) {
        return initialList.stream()
        .filter(model -> model.getId() == id)
        .findFirst()
        .orElse(null);
    }

    public LaptopFilterService filterByBrand(String...brands) {
        initialList.stream().filter(model -> initialList.containsAll(List.of(brands))).forEach(m -> filteredList.add(m));
        return this;
    }

    public LaptopFilterService filterByCPU(String...CPU) {
        initialList.stream().filter(model -> initialList.containsAll(List.of(CPU))).forEach(m -> filteredList.add(m));
        return this;
    }

    public LaptopFilterService filterByColor(String...color) {
        initialList.stream().filter(model -> model.getColor().equals(color)).forEach(m -> filteredList.add(m));    
        return this;
    }

    public LaptopFilterService filterByScreen(int screen) {
        initialList.stream().filter(model -> model.getScreen() == screen).forEach(m -> filteredList.add(m));
        return this;
    }

    public LaptopFilterService filterByRAM(int RAM) {
        initialList.stream().filter(model -> model.getRAM() == RAM).forEach(m -> filteredList.add(m));
        return this;
    }

    public LaptopFilterService filterBySSD(int SSD) {
        initialList.stream().filter(model -> model.getSSD() == SSD).forEach(m -> filteredList.add(m));
        return this;
    }

}
