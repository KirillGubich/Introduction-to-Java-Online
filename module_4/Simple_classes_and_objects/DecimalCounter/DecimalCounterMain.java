package by.jonline.simple_class.counter;

public class DecimalCounterMain {

	public static void main(String[] args) {

		DecimalCounter counter = new DecimalCounter(0, 0, 5);

		counter.increaseCounter();
		counter.increaseCounter();
		counter.decreaseCounter();
		System.out.println(counter.getCurrentState());

	}

}
