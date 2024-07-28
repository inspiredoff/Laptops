package model_laptop;

import java.util.List;
import java.util.Random;

public class Director {

    public static void constructLaptop(Builder builder,
                                       String brand,
                                       String model,
                                       String CPU,
                                       Integer RAM,
                                       Integer SSD,
                                       Integer screen,
                                       String color) {
        builder
                .setId()
                .setBrand(brand)
                .setModel(model)
                .setCPU(CPU)
                .setRAM(RAM)
                .setSSD(SSD)
                .setScreen(screen)
                .setColor(color);
    }

    public static void constructLaptopRandom(Builder builder,
                                             List <String> brands,
                                             List<String> CPUs,
                                             List<Integer> RAMs,
                                             List<Integer> SSDs,
                                             List<Integer> screens,
                                             List<String> colors,
                                             int length) {

        int brandIndex = (int) (Math.random() * brands.size());
        int CPUIndex = (int) (Math.random() * CPUs.size());
        int RAMIndex = (int) (Math.random() * RAMs.size());
        int SSDIndex = (int) (Math.random() * SSDs.size());
        int screenIndex = (int) (Math.random() * screens.size());
        int colorIndex = (int) (Math.random() * colors.size());
        builder
                .setId()
                .setBrand(brands.get(brandIndex))
                .setModel(generateRandomString(length))
                .setCPU(CPUs.get(CPUIndex))
                .setRAM(RAMs.get(RAMIndex))
                .setSSD(SSDs.get(SSDIndex))
                .setScreen(screens.get(screenIndex))
                .setColor(colors.get(colorIndex));
    }

    private static String generateRandomString(int length) {
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