package by.jonline.simple_class.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {

	// Список рейсов для заданного пункта назначения
	public List<Airline> getFlightsByDestination(AirlineList airlineList, String destination) {
		List<Airline> flights = new ArrayList<Airline>();

		for (Airline airline : airlineList.getList()) {
			if (airline.getDestination() == destination) {
				flights.add(airline);
			}
		}

		return flights;
	}

	// Список рейсов для заданного дня недели
	public List<Airline> getFlightsByDayOfWeek(AirlineList airlineList, String dayOfWeek) {
		List<Airline> flights = new ArrayList<Airline>();

		for (Airline airline : airlineList.getList()) {
			if (airline.getDayOfWeek() == dayOfWeek) {
				flights.add(airline);
			}
		}

		return flights;
	}

	// Список рейсов для заданного дня недели, время вылета для которых больше
	// заданного
	public List<Airline> getFlightsByDayAndTime(AirlineList airlineList, String dayOfWeek, Time time) {
		List<Airline> flights = new ArrayList<Airline>();

		for (Airline airline : airlineList.getList()) {
			boolean isLater;
			isLater = airline.getDepartureTime().compareTo(time) > 0;

			if (airline.getDayOfWeek() == dayOfWeek && isLater) {
				flights.add(airline);
			}
		}

		return flights;
	}

}
