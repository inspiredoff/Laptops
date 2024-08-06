package presenter;

import java.util.List;

import service.Service;
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
	
	public void createRandomLaptops(List <String> brands,
									List<String> CPUs,
									List<Integer> RAMs,
									List<Integer> SSDs,
									List<Integer> screens,
									List<String> colors,
									int length){
		service.createRandomLaptops(brands, CPUs, RAMs, SSDs, screens, colors, length);
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
