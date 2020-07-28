package by.jonline.sort.main;

import java.util.Arrays;

/*
   Пусть даны две неубывающие последовательности действительных чисел a и b. 
   Требуется указать те места, на которые нужно вставлять элементы последовательности b 
   в первую последовательность так, чтобы новая последовательность оставалась возрастающей. 
*/

public class Task7 {

	public static void main(String[] args) {
		int[] firstSequence;
		int[] secondSequence;

		int firstSequenceLength = 6;
		int secondSequenceLength = 8;

		firstSequence = generateArray(firstSequenceLength);
		secondSequence = generateArray(secondSequenceLength);

		ascendingSort(firstSequence);
		ascendingSort(secondSequence);

		System.out.println("Первая последовательность " + Arrays.toString(firstSequence));
		System.out.println("Вторая последовательность " + Arrays.toString(secondSequence));

		System.out.println();
		
		// Поиск мест,на которые нужно вставлять элементы последовательности b 
		// в первую последовательность так, чтобы новая последовательность оставалась возрастающей
		
		for (int i = 0; i < secondSequence.length; i++) {
			int position;
			position = binarySearch(firstSequence, secondSequence[i], 0, firstSequenceLength);

			System.out.print(secondSequence[i]);

			if (position == firstSequenceLength) {
				System.out.println(" на последнее место");
			} else if (position == 0) {
				System.out.println(" на первое место");
			} else {
				System.out.println(" на место после элеметна номер " + position);
			}

		}

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

}
