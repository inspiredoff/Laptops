package service.service;

import service.model_laptop.Laptop;

import java.util.ArrayList;
import java.util.List;



public class Database {
    private List<Laptop> laptops = new ArrayList<>();

    public Database() {
        laptops = new ArrayList<>();
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void addLaptops(Laptop laptop){
        this.laptops.add(laptop);
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
