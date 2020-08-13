package by.jonline.simple_class.counter;

/*
  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать 
  свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями 
  по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, 
  и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса. 
*/

public class DecimalCounter {

	private int currentState;
	private int minValue;
	private int maxValue;

	public DecimalCounter() {
		currentState = 0;
		minValue = 0;
		maxValue = Integer.MAX_VALUE;
	}

	public DecimalCounter(int currentState, int minValue, int maxValue) {
		this.currentState = currentState;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public int getCurrentState() {
		return currentState;
	}

	// Увеличение счетчика
	public void increaseCounter() {
		if (currentState == maxValue) {
			System.out.println("Достигнуто максимальное значение.");
		} else {
			currentState++;
		}
	}

	// Уменьшение счетчика
	public void decreaseCounter() {
		if (currentState == minValue) {
			System.out.println("Достигнуто минимальное значение.");
		} else {
			currentState--;
		}
	}

}
