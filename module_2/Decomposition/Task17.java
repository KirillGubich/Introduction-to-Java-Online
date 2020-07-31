package by.jonline.decomposition.main;

import java.util.Scanner;

/*
 *  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 *  Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */

public class Task17 {

	public static void main(String[] args) {
		int number;
		boolean incorrectInput;

		do {
			number = getIntFromConsole("N = ");
			incorrectInput = number < 0;
			if (incorrectInput) {
				System.out.println("Введите положительное значение");
			}
		} while (incorrectInput);

		int operCount;
		operCount = getOperationsNum(number);

		System.out.println("Количество действий: " + operCount);
	}

	// Подсчет количества операций
	private static int getOperationsNum(int num) {
		int operationCount = 0;

		while (num != 0) {
			num -= getSumOfDigits(num);
			operationCount++;
		}

		return operationCount;
	}

	// Сумма цифр числа
	private static int getSumOfDigits(int num) {
		int sum = 0;

		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}

		return sum;
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
