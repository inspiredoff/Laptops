package services;

import java.util.ArrayList;
import java.util.Random;

import java.util.List;

public class Service {
    private List<Models> modelsList;

    public Service(List<Models> modelsList) {
        this.modelsList = modelsList;
    }

    public Service() {
        this.modelsList = new ArrayList<>();
    }

    public void addModel(Models model) {
        modelsList.add(model);
    }

    public List<Models> getModelsList() {
        return modelsList;
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

    private String generateRandomString(int length) {
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        int rnd_length = random.nextInt(length);
        StringBuilder sb = new StringBuilder(rnd_length);
        for (int i = 0; i < rnd_length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public Models addRandomModel(List<String> brands,
                                 List<String> CPUs,
                                 List<Integer> RAMs,
                                 List<Integer> SSDs,
                                 List<Integer> screens,
                                 List<String> colors) {
        String brand = brands.get((int) (Math.random() * brands.size()));
        String model = generateRandomString(10);
        String CPU = CPUs.get((int) (Math.random() * CPUs.size()));
        int RAM = RAMs.get((int) (Math.random() * RAMs.size()));
        int SSD = SSDs.get((int) (Math.random() * SSDs.size()));
        int screen = screens.get((int) (Math.random() * screens.size()));
        String color = colors.get((int) (Math.random() * colors.size()));
        return new Models(brand, model, CPU, RAM, SSD, screen, color);

    }







}
