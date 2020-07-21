package by.jonline.array.main;

/*
   В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
   Если таких чисел несколько, то определить наименьшее из них. 
*/

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		int n = 10;
		int[] numArray = generateArray(n);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		int encounteredEl = 0;
		int entriesMax = 0;
		for (int i = 0; i < numArray.length; i++) {
			int entriesCount = 0;

			// Подсчет количества вхождений очередного элемента
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] == numArray[j]) {
					entriesCount++;
				}
			}

			// Проверка случая, когда совпадает число вхождений в массив,
			// не меньше ли новое найденное значение
			boolean isSmaller;
			isSmaller = entriesCount == entriesMax && numArray[i] < encounteredEl;

			if (entriesCount > entriesMax || isSmaller) {
				encounteredEl = numArray[i];
				entriesMax = entriesCount;
			}
		}

		System.out.println("Результат: " + encounteredEl);

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
