package by.jonline.composition.tourism.entity;

public class Tour {

	private String destination;
	private TourType tourType;
	private Transport transport;
	private MealType mealType;
	private int dayCount;
	private double price;

	public Tour() {
		destination = "default";
		tourType = TourType.ADVENTURE;
		transport = Transport.BUS;
		mealType = MealType.ROOM_ONLY;
		dayCount = 0;
		price = 0.0;
	}

	public Tour(String destination, TourType tourType, Transport transport, MealType mealType, int dayCount,
			double price) {
		this.destination = destination;
		this.tourType = tourType;
		this.transport = transport;
		this.mealType = mealType;
		this.dayCount = dayCount;
		this.price = price;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public TourType getTourType() {
		return tourType;
	}

	public void setTourType(TourType tourType) {
		this.tourType = tourType;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public MealType getMealType() {
		return mealType;
	}

	public void setMealType(MealType mealType) {
		this.mealType = mealType;
	}

	public int getDayCount() {
		return dayCount;
	}

	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tour destination: " + destination + ", tour type: " + tourType + ", transport: " + transport
				+ ", meal type: " + mealType + ", days: " + dayCount + ", price: " + price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dayCount;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((mealType == null) ? 0 : mealType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tourType == null) ? 0 : tourType.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		Tour other = (Tour) obj;
		if (dayCount != other.dayCount)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (mealType != other.mealType)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (tourType != other.tourType)
			return false;
		if (transport != other.transport)
			return false;
		return true;
	}

}
