package by.jonline.loop.main;

/*
   Для каждого натурального числа в промежутке от m до n вывести все делители, 
   кроме единицы и самого числа. m и n вводятся с клавиатуры
*/

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		int m;
		int n;
		
		boolean incorrectInput;

		// Ввод исходных данных с консоли и проверка их корректности

		do {
			m = getIntFromConsole();
			n = getIntFromConsole();
			incorrectInput = m < 1 || n < 1 || m > n;
			if (incorrectInput) {
				System.out.println("Введите значения больше нуля.");
				System.out.println("Первое значение должно быть не больше второго");
			}
		} while (incorrectInput);
		
		System.out.println();

		for (int i = m; i <= n; i++) {
			getDividers(i);
		}
	}

	// Выводит все делители числа
	public static void getDividers(int num) {
		System.out.print(num + "  : ");
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// Ввод с консоли целого числа
	private static int getIntFromConsole() {

		int num;
		Scanner in = new Scanner(System.in);

		System.out.print(">> ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print(">> ");
		}
		num = in.nextInt();

		return num;
	}

}
