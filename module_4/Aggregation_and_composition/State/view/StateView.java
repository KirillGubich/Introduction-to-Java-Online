package by.jonline.composition.state.view;

import by.jonline.composition.state.entity.Region;
import by.jonline.composition.state.entity.State;

public class StateView {
	
	// Вывод столицы
	public void viewCapital(State state) {
		System.out.println("Capital: " + state.getCapital().getName());
	}

	// Вывод количества областей
	public void viewRegionsCount(State state) {
		System.out.println("Number of regions: " + state.getRegions().size());
	}
	
	// Вывод площади
	public void viewArea(State state) {
		System.out.println("Area: " + state.getArea());
	}
	
	// Вывод областных центров
	public void viewRegions(State state) {
		System.out.print("Region centers: ");
		for (Region region : state.getRegions()) {
			System.out.print(region.getCenter().getName() + " ");
		}
	}
}
