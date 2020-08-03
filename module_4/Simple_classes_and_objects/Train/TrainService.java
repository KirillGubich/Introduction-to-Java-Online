package by.jonline.simple_class.main;

import java.util.List;

public class TrainService {

	// Сортировка поездов по номеру
	public void sortTrainsByNumber(List<Train> trains) {
		for (int i = trains.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (trains.get(j).getTrainNumber() > trains.get(j + 1).getTrainNumber()) {
					Train tempEl;
					tempEl = trains.get(j);
					trains.remove(j);
					trains.add(j, trains.get(j));
					trains.remove(j + 1);
					trains.add(j + 1, tempEl);
				}
			}
		}
	}

	// Сортирвка поездов по пункту назначения
	public void sortTrainsByDestination(List<Train> trains) {
		for (int i = trains.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (trains.get(j).getDestination().compareTo(trains.get(j + 1).getDestination()) > 0) {
					Train tempEl;
					tempEl = trains.get(j);
					trains.remove(j);
					trains.add(j, trains.get(j));
					trains.remove(j + 1);
					trains.add(j + 1, tempEl);
				}
			}
		}
	}

	// Сортировка поездов с одинаковым пунктом назначения по времени отправления
	public void sortTrainsByTime(List<Train> trains) {
		for (int i = trains.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				boolean sameDestination;
				sameDestination = trains.get(j).getDestination().compareTo(trains.get(j + 1).getDestination()) == 0;
				boolean isLater;
				isLater = trains.get(j).getDepartureTime().compareTo(trains.get(j + 1).getDepartureTime()) > 0;

				if (sameDestination && isLater) {
					Train tempEl;
					tempEl = trains.get(j);
					trains.remove(j);
					trains.add(j, trains.get(j));
					trains.remove(j + 1);
					trains.add(j + 1, tempEl);
				}
			}
		}
	}

}
