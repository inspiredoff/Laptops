package services;

import java.util.List;
import java.util.Random;

import services.Models;

public class CreateModels extends Service {

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
        Models models = new Models(brand, model, CPU, RAM, SSD, screen, color);
//        models.setId(models_id++);
        new Models(brand, model, CPU, RAM, SSD, screen, color);
        return models;
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

}
