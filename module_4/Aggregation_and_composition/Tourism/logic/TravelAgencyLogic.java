package by.jonline.composition.tourism.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.jonline.composition.tourism.entity.*;

public class TravelAgencyLogic {

	// Поиск тура по транспорту, типу питания и количеству дней
	public List<Tour> searchTour(TravelAgency travelAgency, Transport transport, MealType mealType, int dayCount) {
		List<Tour> suitableTours = new ArrayList<Tour>();

		for (Tour tour : travelAgency.getTours()) {
			boolean isSuitable;
			isSuitable = tour.getTransport() == transport && tour.getMealType() == mealType
					&& tour.getDayCount() == dayCount;

			if (isSuitable) {
				suitableTours.add(tour);
			}
		}

		return suitableTours;
	}

	// Поиск тура по транспорту
	public List<Tour> searchTour(TravelAgency travelAgency, Transport transport) {
		List<Tour> suitableTours = new ArrayList<Tour>();

		for (Tour tour : travelAgency.getTours()) {
			boolean isSuitable;
			isSuitable = tour.getTransport() == transport;

			if (isSuitable) {
				suitableTours.add(tour);
			}
		}

		return suitableTours;
	}

	// Поиск тура по типу питания
	public List<Tour> searchTour(TravelAgency travelAgency, MealType mealType) {
		List<Tour> suitableTours = new ArrayList<Tour>();

		for (Tour tour : travelAgency.getTours()) {
			boolean isSuitable;
			isSuitable = tour.getMealType() == mealType;

			if (isSuitable) {
				suitableTours.add(tour);
			}
		}

		return suitableTours;
	}

	// Поиск тура по количеству дней
	public List<Tour> searchTour(TravelAgency travelAgency, int dayCount) {
		List<Tour> suitableTours = new ArrayList<Tour>();

		for (Tour tour : travelAgency.getTours()) {
			boolean isSuitable;
			isSuitable = tour.getDayCount() == dayCount;

			if (isSuitable) {
				suitableTours.add(tour);
			}
		}

		return suitableTours;
	}

	// Поиск тура по типу
	public List<Tour> searchTour(TravelAgency travelAgency, TourType tourType) {
		List<Tour> suitableTours = new ArrayList<Tour>();

		for (Tour tour : travelAgency.getTours()) {
			boolean isSuitable;
			isSuitable = tour.getTourType() == tourType;

			if (isSuitable) {
				suitableTours.add(tour);
			}
		}

		return suitableTours;
	}

	// Сортировка по возрастанию количества дней
	public void sortToursByDayCount(TravelAgency travelAgency) {

		travelAgency.getTours().sort(Comparator.comparing(Tour::getDayCount));

	}

	// Сортировка по возрастанию цены
	public void sortToursByPrice(TravelAgency travelAgency) {

		travelAgency.getTours().sort(Comparator.comparing(Tour::getPrice));

	}
}
