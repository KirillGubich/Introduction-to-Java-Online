package by.jonline.decomposition.main;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		int fNum;
		int sNum;

		fNum = getIntFromConsole("Первое число: ");
		sNum = getIntFromConsole("Второе число: ");

		compareDigitNum(fNum, sNum);

	}

	// Определяет, в каком из данных двух чисел больше цифр
	private static void compareDigitNum(int firstNum, int secondNum) {

		if (countDigits(firstNum) > countDigits(secondNum)) {
			System.out.println("В числе " + firstNum + " цифр больше, чем в числе " + secondNum);

		} else if (countDigits(secondNum) > countDigits(firstNum)) {
			System.out.println("В числе " + secondNum + " цифр больше, чем в числе " + firstNum);

		} else {
			System.out.println("Количетсво цифр в числах одинаковое");
		}

	}

	// Подсчет количества цифр в числе
	private static int countDigits(int num) {
		int digitCount = 0;

		while (num != 0) {
			num /= 10;
			digitCount++;
		}

		return digitCount;
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
