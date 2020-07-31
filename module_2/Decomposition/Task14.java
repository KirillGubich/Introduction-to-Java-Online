package by.jonline.decomposition.main;

/*
   Натуральное число, в записи которого n цифр, называется числом Армстронга, 
   если сумма его цифр, возведенные в степень n, равна самому числу. 
   Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию. 
*/

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		int k;

		boolean incorrectInput;

		do {
			k = getIntFromConsole("K = ");
			incorrectInput = k < 1;
			if (incorrectInput) {
				System.out.println("Введите значение больше 0");
			}
		} while (incorrectInput);

		getArmstrongNums(1, k);

	}

	// Поиск всех чисел Армстронга от min до max
	private static void getArmstrongNums(int min, int max) {
		for (int i = min; i <= max; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + "  ");
			}
		}
	}

	// Проверка, является ли число числом Армстронга
	private static boolean isArmstrong(int num) {
		int digitCount;
		digitCount = countDigits(num);

		int digitPowSum;
		digitPowSum = getDigitPow(num, digitCount);

		return digitPowSum == num;
	}

	// Сумма цифр числа, возведенных в степень n
	private static int getDigitPow(int num, int n) {
		int sum = 0;

		while (num != 0) {
			sum += Math.pow(num % 10, n);
			num /= 10;
		}

		return sum;
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
