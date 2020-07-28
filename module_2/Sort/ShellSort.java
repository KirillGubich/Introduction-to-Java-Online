package by.jonline.sort.main;

import java.util.Arrays;

/*
 *  Сортировка Шелла. Дан массив n действительных чисел. 
 *  Требуется упорядочить его по возрастанию. Делается это следующим образом: 
 *  сравниваются два соседних элемента a[i] и a[i+1]. Если a[i] <= a[i+1], то продвигаются на 
 *  один элемент вперед. Если a[i] > a[i+1], то производится перестановка и сдвигаются 
 *  на один элемент назад. Составить алгоритм этой сортировки. 
 */

public class ShellSort {

	public static void main(String[] args) {

		int arrayLength;
		arrayLength = 10;

		int[] numArray = generateArray(arrayLength);
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

	// Сортировка массива методом Шелла
	private static void sort(int[] array) {

		int i = 0;
		while (i < array.length - 1) {

			if (array[i] <= array[i + 1]) {
				i++;
			} else {
				int tempEl = array[i];
				array[i] = array[i + 1];
				array[i + 1] = tempEl;

				if (i != 0) {
					i--;
				}
			}
		}
	}

}
