package by.jonline.branche.main;

/*
Даны два угла треугольника (в градусах). Определить, 
существует ли такой треугольник, и если да, то будет ли он прямоугольным. 
*/

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		int firstAngle;
		int secondAngle;

		boolean incorrectInput;

		// Ввод исходных данных с консоли и проверка их корректности

		do {
			firstAngle = getIntFromConsole("Первый угол = ");
			secondAngle = getIntFromConsole("Второй угол = ");
			incorrectInput = firstAngle <= 0 || secondAngle <= 0;
			if (incorrectInput) {
				System.out.println("Введите положительные значения.");
			}
		} while (incorrectInput);

		// Расчёты

		int thirdAngle;
		thirdAngle = 180 - firstAngle - secondAngle;

		if (thirdAngle > 0) {
			System.out.print("Треугольник существует. ");

			if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90)
				System.out.print("Прямоугольный");
			else
				System.out.print("Не прямоугольный");

		} else
			System.out.print("Треугольник не существует");
	}

	// Ввод с консоли целого числа
	private static int getIntFromConsole(String message) {
		int num;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print(">> " + message);
		while (!in.hasNextInt()) {
			in.next();
			System.out.print("Некорректные данные. >> ");
		}
		num = in.nextInt();

		return num;
	}
}
