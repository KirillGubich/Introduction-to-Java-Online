package by.jonline.decomposition.main;

/*
  Написать программу, определяющую сумму n - значных чисел, 
  содержащих только нечетные цифры. Определить также, сколько четных цифр в найденной сумме. 
  Для решения задачи использовать декомпозицию. 
*/

import java.util.Scanner;

public class Task16 {

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

		int sumOfOddNums;
		int numOfEvenDigits;

		sumOfOddNums = getSumOfOddNumbers(n);
		numOfEvenDigits = getNumOfEvenDigits(sumOfOddNums);

		System.out.println("Сумма: " + sumOfOddNums);
		System.out.println("Четных цифр в сумме: " + numOfEvenDigits);

	}

	// Cуммf n - значных чисел, содержащих только нечетные цифры
	private static int getSumOfOddNumbers(int numOfDigits) {
		int sum = 0;

		for (int i = (int) Math.pow(10, numOfDigits - 1); i < Math.pow(10, numOfDigits); i++) {

			if (isOnlyOddDigits(i)) {
				sum += i;
			}
		}

		return sum;
	}

	// Проверка, состоит ли число только из нечетных цифр
	private static boolean isOnlyOddDigits(int num) {

		while (num != 0) {
			if (num % 2 == 0) {
				return false;
			}

			num /= 10;
		}

		return true;
	}

	// Подсчет количетва четных цифр в числе
	private static int getNumOfEvenDigits(int num) {
		int evenCount = 0;

		while (num != 0) {
			if (num % 2 == 0) {
				evenCount++;
			}

			num /= 10;
		}

		return evenCount;
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
