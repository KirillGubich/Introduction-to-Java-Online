package by.jonline.simple_class.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {

	private List<Airline> list;

	public AirlineList() {
		list = new ArrayList<Airline>();
	}

	public AirlineList(List<Airline> list) {
		this.list = list;
	}

	public void addAirline(Airline airline) {
		list.add(airline);
	}

	public List<Airline> getList() {
		return list;
	}

	public void setList(List<Airline> list) {
		this.list = list;
	}

}
