package service.service;

import java.util.List;

import service.model_laptop.GeneratorData;
import service.model_laptop.Laptop;
import service.model_laptop.LaptopBuilder;

public class Service {
	// private Laptop laptop;
	// private LaptopBuilder laptopbuilder;
	// private Director director;
	private CreateLaptop createLaptop;
	private LaptopFilterService filterService;
	private DatabaseLaptop database;
	

	public Service(){
		this.createLaptop = new CreateLaptop();
		this.database = new DatabaseLaptop();
		this.filterService = new LaptopFilterService(database);

	}
    public void createManualLaptop(String brand,
									String model,
									String CPU,
									Integer RAM,
									Integer SSD,
									Integer screen,
									String color){
		SaveDatabase(createLaptop.createLaptop(brand, model, CPU, RAM, SSD, screen, color));
	}

	public void createRandomLaptops(int length){
		for (int i = 0; i< length; i++) {
			SaveDatabase(createLaptop.createLaptop(
							   GeneratorData.rndChoiseElemList(new DatabaseParam().getBrands()),
							   GeneratorData.createRndModel(10), 
							   GeneratorData.rndChoiseElemList(new DatabaseParam().getCPUs()),
							   GeneratorData.rndChoiseElemList(new DatabaseParam().getRams()),
							   GeneratorData.rndChoiseElemList(new DatabaseParam().getSSDs()),
							   GeneratorData.rndChoiseElemList(new DatabaseParam().getScreens()),
							   GeneratorData.rndChoiseElemList(new DatabaseParam().getColor())
						   ));
		}
	}

	public void printLaptop(){
		printDatainList(database.getLaptops());
	}

	private void SaveDatabase(Laptop laptop){
		this.database.addLaptops(laptop);
	}

	private void printDatainList(List<Laptop> list){
		for(Laptop elem : list){
			System.out.println(elem);
		}
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

	public void refreshFilter(){
		filterService.refresh();
	}

	public void getFilteredLaptops(){
		printDatainList(filterService.getFilteredModels());
	}
}
