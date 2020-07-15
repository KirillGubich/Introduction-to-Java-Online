package by.jonline.loop.main;

//  Вычислить значения функции на отрезке [а,b] c шагом h

public class Task2 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;

		a = -2;
		b = 5;
		h = 0.5;

		double x;
		x = a;
		
		// Расчёт значения функции
		
		while (x <= b) {
			double y = x > 2 ? x : -x;
			System.out.println("x = " + x + "  y = " + y);
			x += h;
		}
	}
}