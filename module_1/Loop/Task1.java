package by.jonline.loop.main;

/*
   Напишите программу, где пользователь вводит любое целое положительное число. 
   А программа суммирует все числа от 1 до введенного пользователем числа. 
*/

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		int num;

		boolean incorrectInput;

		// Ввод исходных данных с консоли и проверка их корректности

		do {
			num = getIntFromConsole();
			incorrectInput = num < 1;
			if (incorrectInput) {
				System.out.println("Введите значение больше нуля.");
			}
		} while (incorrectInput);

		// Подсчёт суммы чисел от 1 до введенного числа
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;

		System.out.println("Cумма = " + sum);
	}

	// Ввод с консоли целого числа
	private static int getIntFromConsole() {

		int num;
		Scanner in = new Scanner(System.in);

		System.out.print(">> ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print("Некорректные данные. >> ");
		}
		num = in.nextInt();

		return num;
	}
}