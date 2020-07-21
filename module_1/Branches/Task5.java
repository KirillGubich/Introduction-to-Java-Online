package by.jonline.branche.main;

//  Вычислить значение функции

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		double x;

		x = getDoubleFromConsole("x = ");

		double result;
		result = x <= 3 ? x * x - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
		System.out.println(result);
	}
	
	// Ввод с консоли вещественного числа
	private static double getDoubleFromConsole(String message) {
		double num;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print(">> " + message);
		while (!in.hasNextDouble()) {
			in.next();
			System.out.print(">> ");
		}
		
		num = in.nextDouble();
		return num;
	}
}
