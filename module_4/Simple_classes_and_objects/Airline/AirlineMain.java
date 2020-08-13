package by.jonline.simple_class.airline;

import java.util.List;

/*
   Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, 
   set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, 
   с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
*/

public class AirlineMain {

	public static void main(String[] args) {

		AirlineList airlineList = new AirlineList();

		airlineList.addAirline(new Airline("Moscow", 4763, "Buisness", new Time(15, 34, 00), "Thuesday"));
		airlineList.addAirline(new Airline("Vilnius", 3456, "Econom", new Time(5, 49, 00), "Monday"));
		airlineList.addAirline(new Airline("Berlin", 4233, "Econom", new Time(1, 12, 00), "Friday"));
		airlineList.addAirline(new Airline("Moscow", 8546, "Buisness", new Time(23, 56, 00), "Monday"));
		airlineList.addAirline(new Airline("Amsterdam", 4455, "Econom", new Time(19, 45, 00), "Sunday"));

		AirlineLogic airlineLogic = new AirlineLogic();
		AirlineView airlineView = new AirlineView();

		airlineView.viewAirlineList(airlineList);

		List<Airline> flightsByDest;
		flightsByDest = airlineLogic.getFlightsByDestination(airlineList, "Moscow");
		airlineView.viewAirlineList(flightsByDest);

		List<Airline> flightsByDayOfWeek;
		flightsByDayOfWeek = airlineLogic.getFlightsByDayOfWeek(airlineList, "Friday");
		airlineView.viewAirlineList(flightsByDayOfWeek);

		List<Airline> flightsByDayAndTime;
		flightsByDayAndTime = airlineLogic.getFlightsByDayAndTime(airlineList, "Monday", new Time(5, 48, 0));
		airlineView.viewAirlineList(flightsByDayAndTime);

	}

}
