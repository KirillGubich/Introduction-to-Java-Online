package by.jonline.composition.state.entity;

import java.util.ArrayList;
import java.util.List;

public class District {

	private String name;
	private City center;
	private double area;
	private List<City> cities;

	public District() {
		name = "default";
		center = new City();
		area = 0;
		cities = new ArrayList<City>();
	}

	public District(String name, City center, double area, List<City> cities) {
		super();
		this.name = name;
		this.center = center;
		this.area = area;
		this.cities = cities;
	}

	public District(String name, City center, double area) {
		super();
		this.name = name;
		this.center = center;
		this.area = area;
		cities = new ArrayList<City>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCenter() {
		return center;
	}

	public void setCenter(City center) {
		this.center = center;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "District [name=" + name + ", center=" + center + ", area=" + area + ", cities=" + cities + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		District other = (District) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
