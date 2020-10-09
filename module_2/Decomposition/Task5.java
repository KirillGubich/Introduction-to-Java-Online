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
		
		int maxEl = array[0];
		int secondMax;

		if (array[0] > array[1]) {
			secondMax = array[1];
			maxEl = array[0];
		} else {
			secondMax = array[0];
			maxEl = array[1];
		}

		for (int i = 2; i < array.length; i++) {

			if (array[i] > maxEl) {
				secondMax = maxEl;
				maxEl = array[i];
			} else if (array[i] > secondMax) {
				secondMax = array[i];
			}
		}

		return secondMax;
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
