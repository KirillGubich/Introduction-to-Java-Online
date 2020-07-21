package by.jonline.array.main;

/*
   Дан массив действительных чисел, размерность которого N.
   Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов
*/

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int n = 10;
		double[] numArray = generateArray(n);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		int pos = 0; // Количество положительных элементов
		int neg = 0; // Количество отрицательных элементов
		int zero = 0; // Количество нулевых элементов

		for (double num : numArray) {
			if (num > 0) {
				pos++;
			} else if (num == 0) {
				zero++;
			} else {
				neg++;
			}
		}

		System.out.println("Положительных: " + pos);
		System.out.println("Отрицательных: " + neg);
		System.out.println("Нулевых: " + zero);
	}

	// Генерирует случайный массив вещественных чисел
	private static double[] generateArray(int length) {
		double[] randArray = new double[length];
		double element;

		for (int i = 0; i < randArray.length; i++) {
			element = Math.random() * 100 - 50;
			element = Math.round(element * 100) / 100d;

			randArray[i] = element;
		}

		return randArray;
	}
}
