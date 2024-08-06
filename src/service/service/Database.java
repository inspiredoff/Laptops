package service;

import java.util.ArrayList;
import java.util.List;

import model_laptop.Laptop;

public class Database {
    private List<Laptop> laptops;

    public Database() {
        this.laptops = new ArrayList<>();
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void addLaptops(Laptop...laptops){
        this.laptops.addAll(List.of(laptops));
    }

    public Laptop getLaptop(int id){
        Laptop laptop = null;
        for (Laptop l: laptops){
            if (l.getId()==id){
                laptop = l;
            }
        }
        return laptop;
    }
}
