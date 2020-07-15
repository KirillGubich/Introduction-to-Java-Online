package by.jonline.linear.main;

// Вычислить значение выражения по формуле 
// (все переменные принимают действительные значения

public class Task2 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;

		a = 2.5;
		b = 3;
		c = 2.56;

		double res;
		res = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println(res);
	}
}
