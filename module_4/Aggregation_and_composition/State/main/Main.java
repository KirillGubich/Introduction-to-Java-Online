package by.jonline.composition.state.main;

import by.jonline.composition.state.entity.City;
import by.jonline.composition.state.entity.Region;
import by.jonline.composition.state.entity.State;
import by.jonline.composition.state.view.StateView;

/*
Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.  
*/

public class Main {

	public static void main(String[] args) {

		City minsk = new City("Minsk");

		State belarus = new State("Belarus", minsk, 207.6);
		
		belarus.getRegions().add(new Region("Minskaya", new City("Minsk"), 40.2));
		belarus.getRegions().add(new Region("Brestskaya", new City("Brest"), 32.8));
		belarus.getRegions().add(new Region("Vitebskaya", new City("Vitebsk"), 40.0));
		belarus.getRegions().add(new Region("Gomelskaya", new City("Gomel"), 40.4));
		belarus.getRegions().add(new Region("Grodnenskaya", new City("Grodno"), 25.1));
		belarus.getRegions().add(new Region("Mogilevskaya", new City("Mogilev"), 29.1));

		StateView stateView = new StateView();
		
		stateView.viewCapital(belarus);
		stateView.viewRegionsCount(belarus);
		stateView.viewArea(belarus);
		stateView.viewRegions(belarus);
	}

}
