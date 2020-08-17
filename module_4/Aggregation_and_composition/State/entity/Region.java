package by.jonline.composition.state.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private String name;
	private City center;
	private double area;
	private List<District> districts;

	public Region() {
		name = "default";
		center = new City();
		area = 0;
		districts = new ArrayList<District>();
	}

	public Region(String name, City center, double area, List<District> districts) {
		this.name = name;
		this.center = center;
		this.area = area;
		this.districts = districts;
	}

	public Region(String name, City center, double area) {
		this.name = name;
		this.center = center;
		this.area = area;
		districts = new ArrayList<District>();
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

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", center=" + center + ", area=" + area + ", districts=" + districts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
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
		Region other = (Region) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
