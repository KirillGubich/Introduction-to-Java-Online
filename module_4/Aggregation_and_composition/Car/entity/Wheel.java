package by.jonline.composition.car.entity;

public class Wheel {

	private double radius;
	private boolean isWornOut;

	public Wheel() {
		radius = 1;
		isWornOut = false;
	}

	public Wheel(double radius, boolean isWornOut) {
		this.radius = radius;
		this.isWornOut = isWornOut;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isWornOut() {
		return isWornOut;
	}

	public void setWornOut(boolean isWornOut) {
		this.isWornOut = isWornOut;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", isWornOut=" + isWornOut + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isWornOut ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Wheel other = (Wheel) obj;
		if (isWornOut != other.isWornOut)
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

}
