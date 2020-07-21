package by.jonline.array.main;

/*
   Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
   Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. 
 */

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		
		int n = 10;
		
		double[] numArray = generateArray(n);
		System.out.println("исходный массив: " + Arrays.toString(numArray));

		double z;
		z = Task2.getRandDouble(50, 2);
		System.out.println("z = " + z);

		int swapCount = 0; // Счётчик замен
		
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > z) {
				numArray[i] = z;
				swapCount++;
			}
		} 
		System.out.println("Полученный массив: " + Arrays.toString(numArray));
		System.out.println("Количество замен: " + swapCount);
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

	// Генерирует случайное вещественное число
	private static double getRandDouble(int max, int decimalPlaces) {
		double value;
		double scope;

		value = Math.random() * max;
		scope = Math.pow(10, decimalPlaces);
		value = Math.round(value * scope) / scope;

		return value;
	}
}