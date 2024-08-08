package service.service;

import service.model_laptop.Laptop;

public class CreateLaptop {
	private Laptop laptop;
	private int lapId;

	public void addLaptop (){
	}

	public Laptop createLaptop(String brand, String model, String CPU, int RAM, int SSD, int screen, String color){
		this.laptop = new Laptop(brand, model, CPU, RAM, SSD, screen, color);
		this.laptop.setId(lapId++);
		return laptop;
	}

	// private void SaveDatabase(Laptop laptop){
	// 	this.database.addLaptops(laptop);
	// }
}
