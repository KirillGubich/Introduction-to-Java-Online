package by.jonline.array.main;

/*
 * Дана последовательность целых чисел. Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны min 
 */

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		int n = 10;
		int[] numArray = generateArray(n);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		
		int min;
		
		// Поиск минимального элемента
		min = getSmallest(numArray);

		// Подсчет количества элементов в новой последовательности
		int elCount = 0;
		for (int num : numArray) {
			if (num != min) {
				elCount++;
			}
		}

		// Создание новой последовательности
		
		int[] newArray = new int[elCount];
		int i = 0;
		int j = 0;
		while (i < newArray.length) {
			if (numArray[j] != min) {
				newArray[i] = numArray[j];
				i++;
			}
			j++;
		}

		System.out.println("Результат: " + Arrays.toString(newArray));
	}

	// находит наименьший элемент в массиве
	private static int getSmallest(int[] array) {
		int smallestEl = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallestEl) {
				smallestEl = array[i];
			}
		}
		return smallestEl;
	}

	// Генерирует случайный массив целочисленных положительных значений
	private static int[] generateArray(int length) {
		int[] randArray = new int[length];

		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * 11);
		}

		return randArray;
	}

}
