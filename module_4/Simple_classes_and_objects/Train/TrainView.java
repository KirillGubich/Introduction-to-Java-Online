package by.jonline.simple_class.train;

import java.util.List;

public class TrainView {

	// Вывод списка поездов
	public void viewTrainList(List<Train> trains) {
		for (Train train : trains) {
			System.out.println(train.toString());
		}
	}

	// Вывод информации о поезде по его номеру
	public void viewTrainInfo(List<Train> trains) {
		int trainNumber;

		UserDataInput input = new UserDataInput();
		trainNumber = input.getTrainNumber();

		for (Train train : trains) {
			if (train.getTrainNumber() == trainNumber) {
				System.out.println(train.toString());
				return;
			}
		}
		System.out.println("Train does not exist.");
	}

}
