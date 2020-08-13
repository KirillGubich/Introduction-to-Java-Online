package by.jonline.simple_class.airline;

import java.util.List;

public class AirlineView {

	// Вывод всех рейсов в консоль
	public void viewAirlineList(AirlineList airlineList) {
		System.out.println("Список всех рейсов: ");
		for (Airline airline : airlineList.getList()) {
			System.out.println(airline.toString());
		}
		System.out.println();
	}

	// Вывод списка рейсов в консоль
	public void viewAirlineList(List<Airline> airlineList) {
		System.out.println("Список рейсов: ");
		for (Airline airline : airlineList) {
			System.out.println(airline.toString());
		}
		System.out.println();
	}

}
