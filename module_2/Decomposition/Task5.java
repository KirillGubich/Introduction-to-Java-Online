package by.jonline.decomposition.main;

/*
   Составить программу, которая в массиве A[N] находит второе по величине число 
   (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов). 
*/

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		int arraySize = 10;

		int[] numArray = generateArray(arraySize);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		System.out.println("Результат: " + getSecondMaxElement(numArray));

	}

	// Поиск второго по величине числа в массиве
	private static int getSecondMaxElement(int[] array) {
		int maxEl;
		maxEl = getMaxElement(array);

		int secondMax;
		secondMax = -1 * maxEl;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > secondMax && array[i] < maxEl) {
				secondMax = array[i];
			}
		}

		return secondMax;
	}

	// Поиск максимального элемента в массиве
	private static int getMaxElement(int[] array) {
		int maxEl = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxEl) {
				maxEl = array[i];
			}
		}

		return maxEl;
	}

	// Генерирует случайный массив целочисленных положительных значений
	private static int[] generateArray(int length) {
		int[] randArray = new int[length];

		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * 101);
		}

		return randArray;
	}

}
