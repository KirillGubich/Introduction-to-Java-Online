//  Вычислить значения функции на отрезке [а,b] c шагом h
package by.jonline.cycle.main;

public class Task2 {

	public static void main(String[] args) {
		double a = -2;
		double b = 5;
		double h = 0.5;

		double x = a;
		while (x <= b) {
			double y = x > 2 ? x : -x;
			System.out.println("x = " + x + "  y = " + y);
			x += h;
		}
	}
}