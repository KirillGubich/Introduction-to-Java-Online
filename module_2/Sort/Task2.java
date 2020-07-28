package by.jonline.sort.main;

import java.util.Arrays;

/*
   Даны две последовательности. Образовать из них новую последовательность чисел так, 
   чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
*/

public class Task2 {

	public static void main(String[] args) {

		int[] firstSequence;
		int[] secondSequence;

		int firstSequenceLength = 3;
		int secondSequenceLength = 5;

		firstSequence = generateArray(firstSequenceLength);
		secondSequence = generateArray(secondSequenceLength);

		ascendingSort(firstSequence);
		ascendingSort(secondSequence);

		System.out.println("Первая последовательность " + Arrays.toString(firstSequence));
		System.out.println("Вторая последовательность " + Arrays.toString(secondSequence));

		int[] newSequence = createNewSequence(firstSequence, secondSequence);

		System.out.println("Новая последовательность: " + Arrays.toString(newSequence));
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

	// Объединение двух последовательностей
	private static int[] createNewSequence(int[] fSequence, int[] secSequence) {

		int[] resSequence = new int[fSequence.length + secSequence.length];

		int i = 0;
		int j = 0;

		for (int k = 0; k < resSequence.length; k++) {

			boolean endOfSequences; // Выход за границы последовательностей
			endOfSequences = i >= fSequence.length || j >= secSequence.length;

			if (!endOfSequences && fSequence[i] <= secSequence[j]) {
				resSequence[k] = fSequence[i];
				i++;

			} else if (!endOfSequences && fSequence[i] > secSequence[j]) {
				resSequence[k] = secSequence[j];
				j++;

			} else if (i == fSequence.length) {
				resSequence[k] = secSequence[j];
				j++;

			} else {
				resSequence[k] = fSequence[i];
				i++;
			}

		}

		return resSequence;
	}

}
