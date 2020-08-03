package by.jonline.simple_class.main;

public class Train {

	private String destination;
	private int trainNumber;
	private String departureTime;

	public Train() {
		destination = "Default";
		trainNumber = 0;
		departureTime = "00:00";
	}

	public Train(String destination, int trainNumber, String departureTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Train destination = " + destination + ", train number = " + trainNumber + ", departure time = "
				+ departureTime;
	}

}
