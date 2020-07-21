package by.jonline.array.main;

/*
   Задана последовательность N вещественных чисел. 
   Вычислить сумму чисел, порядковые номера которых являются простыми числами.
*/

import java.util.Arrays;

public class Task6 {
	public static void main(String[] args) {
		int n = 10;
		double[] numArray = generateArray(n);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		double sum = 0;

		for (int i = 0; i < numArray.length; i++) {
			if (getPrime(i)) {
				sum += numArray[i];
			}
		}

		System.out.println("Сумма: " + sum);
	}

	// Генерирует случайный массив вещественных чисел
	private static double[] generateArray(int length) {
		double[] randArray = new double[length];
		double element;

		for (int i = 0; i < randArray.length; i++) {
			element = Math.random() * 100;
			element = Math.round(element * 100) / 100d;

			randArray[i] = element;
		}

		return randArray;
	}

	// Проверяет, является ли число простым
	private static boolean getPrime(int num) {
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
