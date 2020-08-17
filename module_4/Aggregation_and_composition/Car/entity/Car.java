package by.jonline.composition.car.entity;

import java.util.Arrays;

public class Car {

	private String model;
	private Engine engine;
	private Wheel[] wheels;
	private double fuelVolume;

	private static final int WHEEL_COUNT = 4;

	public Car() {
		model = "default";
		engine = new Engine();

		wheels = new Wheel[WHEEL_COUNT];
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel();
		}

		fuelVolume = 0.0;
	}

	public Car(String model, Engine engine, Wheel[] wheels, double fuelVolume) {
		this.model = model;
		this.engine = engine;
		this.wheels = wheels;
		this.fuelVolume = fuelVolume;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public Wheel getWheel(int wheelIndex) {
		return wheels[wheelIndex];
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public void setWheel(Wheel wheel, int wheelIndex) {
		this.wheels[wheelIndex] = wheel;
	}

	public double getFuelVolume() {
		return fuelVolume;
	}

	public void setFuelVolume(double fuelVolume) {
		this.fuelVolume = fuelVolume;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + ", wheels=" + Arrays.toString(wheels) + ", fuelVolume="
				+ fuelVolume + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fuelVolume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + Arrays.hashCode(wheels);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (Double.doubleToLongBits(fuelVolume) != Double.doubleToLongBits(other.fuelVolume))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}

}
