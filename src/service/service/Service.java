package service.service;

import service.model_laptop.Laptop;
import service.model_laptop.LaptopBuilder;

public class Service {
	private Laptop laptop;
	private LaptopBuilder laptopbuilder;
	private Director director;
	private LaptopFilterService filterService = new LaptopFilterService();
	private Database database;
	

	public Service(){
		this.laptopbuilder = new LaptopBuilder();
        this.director = new Director(laptopbuilder);
        this.database = director.getDatabase();

	}
    public void createManualLaptop(String brand,
									String model,
									String CPU,
									Integer RAM,
									Integer SSD,
									Integer screen,
									String color){
        director.constructLaptop(brand, model, CPU, RAM, SSD, screen, color);
//		this.database.addLaptops(laptop);
	}

	public void printLaptop(){
		System.out.println(database.getLaptops());
	}

	public void createRandomLaptops(){
		director.createRandomLaptops(15);
	}

	public void filterLaptopsByBrand(String brand){
		filterService.filterByBrand(brand);
	}

	public void filterLaptopsByColor(String color){
		filterService.filterByColor(color);
	}

	public void filterLaptopsByCPU(String CPU){
		filterService.filterByCPU(CPU);
	}

	public void filterLaptopsByRAM(int RAM){
		filterService.filterByRAM(RAM);
	}

	public void filterLaptopsBySSD(int SSD){
		filterService.filterBySSD(SSD);
	}

	public void filterLaptopsByScreen(int Screen){
		filterService.filterByScreen(Screen);
	}

}
