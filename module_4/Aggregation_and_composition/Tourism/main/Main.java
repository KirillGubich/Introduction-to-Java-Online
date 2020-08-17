package by.jonline.composition.tourism.main;

/*
   Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
   (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
   питания и числа дней. Реализовать выбор и сортировку путевок. 
*/

import java.util.List;

import by.jonline.composition.tourism.entity.*;
import by.jonline.composition.tourism.logic.TravelAgencyLogic;
import by.jonline.composition.tourism.view.TourView;

public class Main {
	
	public static void main(String[] args) {
		
		TravelAgency travelAgency = new TravelAgency();
		
		travelAgency.addTour(new Tour("Paris", TourType.EXCURSIONS, Transport.PLANE, MealType.BREAKFAST, 10, 899.00));
		travelAgency.addTour(new Tour("London", TourType.EXCURSIONS, Transport.PLANE, MealType.HALF_BOARD, 7, 999.00));
		travelAgency.addTour(new Tour("Pekin", TourType.WEEKEND, Transport.PLANE, MealType.ROOM_ONLY, 3, 560.00));
		travelAgency.addTour(new Tour("Berlin", TourType.TREATMENT, Transport.BUS, MealType.FULL_BOARD, 14, 479.00));
		travelAgency.addTour(new Tour("Oslo", TourType.CRUISE, Transport.SHIP, MealType.ALL_INCLUSIVE, 5, 600.00));
		
		TravelAgencyLogic travelAgencyLogic = new TravelAgencyLogic();
		TourView tourView = new TourView();
		
		tourView.viewTours(travelAgency.getTours());
		
		travelAgencyLogic.sortToursByDayCount(travelAgency);
		tourView.viewTours(travelAgency.getTours());
		
		List<Tour> planeTours;
		planeTours = travelAgencyLogic.searchTour(travelAgency, Transport.PLANE);
		
		tourView.viewTours(planeTours);
	}

}
