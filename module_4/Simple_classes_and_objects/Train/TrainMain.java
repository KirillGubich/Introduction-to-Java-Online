package by.jonline.simple_class.train;

/*
   Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
   Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива 
   по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
   Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения 
   должны быть упорядочены по времени отправления. 
*/

import java.util.ArrayList;
import java.util.List;

public class TrainMain {

	public static void main(String[] args) {

		List<Train> trains = new ArrayList<>();

		trains.add(new Train("Minsk", 845, "23:44"));
		trains.add(new Train("Minsk", 923, "04:15"));
		trains.add(new Train("Moscow", 634, "13:47"));
		trains.add(new Train("Minsk", 335, "07:28"));
		trains.add(new Train("Amsterdam", 396, "18:06"));

		TrainView trainView = new TrainView();
		TrainService trainService = new TrainService();
		

		trainView.viewTrainInfo(trains);

		trainService.sortTrainsByDestination(trains);
		trainService.sortTrainsByTime(trains);
		trainView.viewTrainList(trains);
	}

}
