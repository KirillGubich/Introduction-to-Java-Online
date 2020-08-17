package by.jonline.composition.car.main;

import by.jonline.composition.car.entity.Car;
import by.jonline.composition.car.entity.Engine;
import by.jonline.composition.car.entity.Wheel;
import by.jonline.composition.car.logic.CarService;
import by.jonline.composition.car.view.CarView;

/*
   Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
   Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля
*/

public class Main {

	public static void main(String[] args) {

		Wheel[] wheels = { new Wheel(16, false), new Wheel(16, false), new Wheel(16, false), new Wheel(16, false) };
		Engine engine = new Engine(false);

		Car car = new Car("BMW", engine, wheels, 0);

		CarService carService = new CarService();
		carService.addFuel(car, 40);
		car.getEngine().setRunning(true);
		carService.drive(car);

		Wheel[] newWheels = { new Wheel(18, false), new Wheel(18, false), new Wheel(18, false), new Wheel(18, false) };
		carService.changeWheels(car, newWheels);

		CarView carView = new CarView();
		carView.viewCarModel(car);
	}

}
