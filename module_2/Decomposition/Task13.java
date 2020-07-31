package by.jonline.decomposition.main;

import java.util.Scanner;

/*
   Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
   Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
   Для решения задачи использовать декомпозицию 
*/

public class Task13 {

	public static void main(String[] args) {
		int n;

		boolean incorrectInput;

		do {
			n = getIntFromConsole("N = ");
			incorrectInput = n <= 2;
			if (incorrectInput) {
				System.out.println("Введите значение больше 2");
			}
		} while (incorrectInput);

		getTwins(n);
	}

	// Поиск и вывод всех пар «близнецов» из отрезка [n,2n]
	private static void getTwins(int n) {

		if (n % 2 == 0) {
			n++;
		}

		System.out.println("Пары «близнецов»: ");
		for (int i = n; i <= 2 * n - 2; i += 2) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.println(i + "  " + (i + 2));
			}
		}
	}

	// Проверка, является ли число простым
	private static boolean isPrime(int num) {

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
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
