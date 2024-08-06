package service.model_laptop;

import java.util.List;
import java.util.Random;

public class GeneratorData {

    public static String createRndModel(int length){
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        int rnd_length = random.nextInt(length);
        StringBuilder sb = new StringBuilder(rnd_length);
        for (int i = 0; i < rnd_length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public static <E> E rndChoiseElemList(List<E> mas){
        int index = (int) (Math.random() * mas.size());
        return mas.get(index);
    }

    

}
