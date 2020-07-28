package by.jonline.sort.main;

import java.util.Arrays;

/*
  Сортировка выбором. Дана последовательность чисел.
  Требуется переставить элементы так, чтобы они были расположены по убыванию. 
  Для этого в массиве, начиная с первого, выбирается наибольший элемент 
  и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, 
  эта процедура повторяется. Написать алгоритм сортировки выбором. 
*/

public class SelectionSort {

	public static void main(String[] args) {

		int arrayLength;
		arrayLength = 10;

		int[] numArray = generateArray(arrayLength);
		ascendingSort(numArray);
		System.out.println("Исходная последовательность " + Arrays.toString(numArray));

		sort(numArray);
		System.out.println("Результат " + Arrays.toString(numArray));
	}

	// Генерирует случайный массив целочисленных положительных значений
	private static int[] generateArray(int length) {
		int[] randArray = new int[length];

		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * 101);
		}

		return randArray;
	}

	// Сортировка массива по возрастанию
	private static void ascendingSort(int[] numArray) {

		for (int i = numArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (numArray[j] > numArray[j + 1]) {
					int tempEl = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = tempEl;
				}
			}
		}
	}

	// Сортировка массива методом выбора
	private static void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			int maxEl = array[i];
			int maxInd = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] > maxEl) {
					maxEl = array[j];
					maxInd = j;
				}
			}

			int tempEl = array[i];
			array[i] = array[maxInd];
			array[maxInd] = tempEl;
		}
	}
}
