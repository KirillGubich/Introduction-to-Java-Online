package by.jonline.composition.tourism.view;

import java.util.List;

import by.jonline.composition.tourism.entity.*;

public class TourView {

	// Вывод списка туров
	public void viewTours(List<Tour> tours) {
		for (Tour tour : tours) {
			System.out.println(tour);
		}

		System.out.println();
	}
}
