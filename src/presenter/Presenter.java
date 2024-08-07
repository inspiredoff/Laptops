package presenter;

import service.service.Service;
import view.View;

public class Presenter {
	private View view;
	private Service service;

	public Presenter(View view ){
		this.view = view;
		this.service = new Service();
	}

	public void createManualLaptop(String brand,
									String model,
									String CPU,
									Integer RAM,
									Integer SSD,
									Integer screen,
									String color){
		service.createManualLaptop(
									brand,
									model,
									CPU,
									RAM,
									SSD,
									screen,
									color);
	}

	public void printLaptops(){
		service.printLaptop();
	}
	
	public void createRandomLaptops(int length){
		service.createRandomLaptops(length);
	}

	public void filterLaptopsByBrand(String brand){
		service.filterLaptopsByBrand(brand);
	}

	public void filterLaptopsByColor(String color){
		service.filterLaptopsByColor(color);
	}

	public void filterLaptopsByCPU(String CPU){
		service.filterLaptopsByCPU(CPU);
	}

	public void filterLaptopsByRAM(int Ram){
		service.filterLaptopsByRAM(Ram);
	}

	public void filterLaptopsByScreen(int Screen){
		service.filterLaptopsByScreen(Screen);
	}

	public void filterLaptopsBySSD(int SSD){
		service.filterLaptopsBySSD(SSD);
	}
	
}
