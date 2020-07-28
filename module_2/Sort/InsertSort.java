package by.jonline.sort.main;

/*
 *  Сортировка вставками. Дана последовательность чисел. 
 *  Требуется переставить числа в порядке возрастания. Делается это следующим образом. 
 *  Пусть a - упорядоченная последовательность, т. е. a1 <= a2. 
 *  Берется следующее число a[i+1] и вставляется в последовательность так, 
 *  чтобы новая последовательность была тоже возрастающей. 
 *  Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. 
 *  Примечание. Место помещения очередного элемента в отсортированную часть производить 
 *  с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции. 
 */

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {

		int arrayLength;
		arrayLength = 10;

		int[] numArray = generateArray(arrayLength);
		System.out.println("Исходная последовательность " + Arrays.toString(numArray));

		sort(numArray);
		System.out.println("Результат " + Arrays.toString(numArray));

	}

	// Сортировка массива методом вставок
	private static void sort(int[] mainArray) {

		int[] tempArray = new int[mainArray.length];

		tempArray[0] = mainArray[0];

		for (int i = 1; i < mainArray.length; i++) {
			int position;
			position = binarySearch(tempArray, mainArray[i], 0, i);
			insertElement(tempArray, mainArray[i], position);
		}

		for (int i = 0; i < mainArray.length; i++) {
			mainArray[i] = tempArray[i];
		}

	}

	// Вставка элемента в массив
	private static void insertElement(int[] array, int element, int pos) {
		for (int i = array.length - 1; i > pos; i--) {
			array[i] = array[i - 1];
		}
		array[pos] = element;
	}

	// Бинарный поиск
	private static int binarySearch(int[] list, int item, int low, int high) {

		int mid;
		mid = (low + high) / 2;

		while (low < high) {

			if (item == list[mid]) {
				return mid;

			} else if (item > list[mid]) {
				low = mid + 1;

			} else {
				high = mid;
			}

			mid = (low + high) / 2;
		}
		return low;

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
