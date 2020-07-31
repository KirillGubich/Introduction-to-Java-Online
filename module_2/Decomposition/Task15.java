package by.jonline.decomposition.main;

/*
   Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую 
   последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию. 
*/

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		int n;

		boolean incorrectInput;

		do {
			n = getIntFromConsole("N = ");
			incorrectInput = n < 0;
			if (incorrectInput) {
				System.out.println("Введите положительное значение");
			}
		} while (incorrectInput);

		getIncNumSequence(n);
	}

	// Поиск натуральных чисел, цифры в которых образуют строго возрастающую
	// последовательность
	private static void getIncNumSequence(int numOfDigits) {
		for (int i = (int) Math.pow(10, numOfDigits - 1); i < Math.pow(10, numOfDigits); i++) {
			if (isIncNum(i)) {
				System.out.print(i + "  ");
			}
		}
	}

	// Проверка, образуют ли цифры числа строго возрастающую последовательность
	private static boolean isIncNum(int num) {
		int digit;
		digit = num % 10;
		num /= 10;

		while (num != 0) {
			if (num % 10 >= digit) {
				return false;
			}

			digit = num % 10;
			num /= 10;
		}

		return true;
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
