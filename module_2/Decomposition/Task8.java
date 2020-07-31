package by.jonline.decomposition.main;

import java.util.Arrays;

/*
   Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
   Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов 
   массива с номерами от k до m. 
*/

public class Task8 {

	public static void main(String[] args) {
		int arraySize = 10;

		int[] numArray = generateArray(arraySize);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		System.out.println(sumOfElements(numArray, 2, 4));
	}

	// Генерирует случайный массив целочисленных положительных значений
	private static int[] generateArray(int length) {
		int[] randArray = new int[length];

		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * 101);
		}

		return randArray;
	}

	private static int sumOfElements(int[] numArray, int min, int max) {
		int sum = 0;

		for (int i = min; i <= max; i++) {
			sum += numArray[i];
		}

		return sum;
	}

}
