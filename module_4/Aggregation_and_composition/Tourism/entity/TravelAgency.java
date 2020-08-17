package by.jonline.composition.tourism.entity;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {

	private String name;
	private List<Tour> tours;

	public TravelAgency() {
		name = "default";
		tours = new ArrayList<Tour>();
	}

	public TravelAgency(String name) {
		this.name = name;
		tours = new ArrayList<Tour>();
	}

	public TravelAgency(String name, List<Tour> tours) {
		this.name = name;
		this.tours = tours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

	// Добавление тура
	public void addTour(Tour tour) {
		tours.add(tour);
	}

	@Override
	public String toString() {
		return "TravelAgency [name=" + name + ", tours=" + tours + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tours == null) ? 0 : tours.hashCode());
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
		TravelAgency other = (TravelAgency) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tours == null) {
			if (other.tours != null)
				return false;
		} else if (!tours.equals(other.tours))
			return false;
		return true;
	}

}
