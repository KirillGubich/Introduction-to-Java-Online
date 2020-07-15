package by.jonline.branche.main;

//  Найти max{min(a, b), min(c, d)}. 

public class Task2 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = 1;
		b = 2;
		c = 3;
		d = 4;

		int minAB;
		int minCD;

		minAB = a < b ? a : b; // Поиск минимального из а и b
		minCD = c < d ? c : d; // Поиск минимального из c и d

		// Поиск максимального из minAB и minCD

		if (minAB > minCD) {
			System.out.println(minAB);
		} else {
			System.out.println(minCD);
		}

	}
}
