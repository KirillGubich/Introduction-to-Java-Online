package by.jonline.composition.car.logic;

import by.jonline.composition.car.entity.Car;
import by.jonline.composition.car.entity.Wheel;

public class CarService {

	// Ехать на машине
	public void drive(Car car) {
		boolean isTankEmpty;
		isTankEmpty = car.getFuelVolume() == 0;
		if (car.getEngine().isRunning() && !isTankEmpty) {
			System.out.println("Driving...");
		} else {
			System.out.println("Check car condition");
		}
	}
	
	// Заправить машину
	public void addFuel(Car car, double fuel) {
		double fuelVolume;
		fuelVolume = car.getFuelVolume();
		fuelVolume += fuel;
		car.setFuelVolume(fuelVolume);
	}
	
	// Заменить колеса
	public void changeWheels(Car car, Wheel[] wheels) {
		car.setWheels(wheels);
	}
	
	// Заменить колесо
	public void changeWheel(Car car, Wheel wheel, int wheelIndex) {
		car.setWheel(wheel, wheelIndex);
	}
}
