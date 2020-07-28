package by.jonline.sort.main;

/*
   Даны дроби. Составить программу, которая приводит эти дроби к общему знаменателю 
   и упорядочивает их в порядке возрастания. 
*/

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		int[] numerators;
		int[] denominators;

		int fractionCount = 4;

		numerators = generateArray(fractionCount);
		denominators = generateArray(fractionCount);

		System.out.println(Arrays.toString(numerators));

		for (int i = 0; i < fractionCount; i++) {
			System.out.print("----");
		}

		System.out.println();
		System.out.println(Arrays.toString(denominators));
		System.out.println();

		// Выяисление общего знаменателя
		int commonDenominator = 1;

		for (int i = 0; i < denominators.length; i++) {
			commonDenominator = getLCM(commonDenominator, denominators[i]);
		}

		// Приведение к общему знаменателю
		for (int i = 0; i < fractionCount; i++) {
			numerators[i] *= commonDenominator / denominators[i];
			denominators[i] = commonDenominator;
		}

		// Сортировка
		ascendingSort(numerators);

		// Вывод результата
		System.out.println(Arrays.toString(numerators));

		for (int i = 0; i < fractionCount; i++) {
			System.out.print("----");
		}

		System.out.println();
		System.out.println(Arrays.toString(denominators));
	}

	// Генерирует случайный массив целочисленных положительных значений
	private static int[] generateArray(int length) {
		int[] randArray = new int[length];

		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * 10 + 1);
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

	// Поиск НОК двух чисел
	private static int getLCM(int firstNum, int secondNum) {

		int mul;
		mul = firstNum * secondNum;

		while (firstNum != secondNum) {

			if (firstNum > secondNum) {
				firstNum -= secondNum;
			} else {
				secondNum -= firstNum;
			}
		}

		return mul / firstNum;
	}

}
