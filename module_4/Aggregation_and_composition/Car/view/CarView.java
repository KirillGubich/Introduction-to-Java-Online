package by.jonline.composition.car.view;

import by.jonline.composition.car.entity.Car;

public class CarView {

	// Вывод в консоль марки автомобиля
	public void viewCarModel(Car car) {
		System.out.println("Model: " + car.getModel());
	}
}
