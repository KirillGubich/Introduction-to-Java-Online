package by.jonline.sort.main;

import java.util.Arrays;

/*
 * Сортировка обменами. Дана последовательность чисел. 
 * Требуется переставить числа в порядке возрастания. 
 * Для этого сравниваются два соседних числа. Если a[i] > a[i+1], то делается перестановка. 
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок. 
*/

public class BubbleSort {

	public static void main(String[] args) {

		int arrayLength;
		arrayLength = 10;

		int[] numArray = generateArray(arrayLength);
		System.out.println("Исходная последовательность " + Arrays.toString(numArray));

		int numberOfPermutations;
		numberOfPermutations = sort(numArray);

		System.out.println("Результат " + Arrays.toString(numArray));
		System.out.println("Количество перестановок: " + numberOfPermutations);

	}

	// Генерирует случайный массив целочисленных положительных значений
	private static int[] generateArray(int length) {
		int[] randArray = new int[length];

		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * 101);
		}

		return randArray;
	}

	// Сортировка массива методом обмена
	private static int sort(int[] numArray) {

		int transpCount = 0;

		for (int i = numArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (numArray[j] > numArray[j + 1]) {
					int tempEl = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = tempEl;

					transpCount++;
				}
			}
		}

		return transpCount;
	}

}
