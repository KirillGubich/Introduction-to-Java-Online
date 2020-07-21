package by.jonline.array.main;

/*
   Даны действительные числа а1 ,а2 ,..., аn . 
   Поменять местами наибольший и наименьший элементы. 
*/

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		int n = 10;
		double[] numArray = generateArray(n);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		int maxInd = 0;
		int minInd = 0;

		// Поиск наибольшего и наименьшего элемента
		
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] > numArray[maxInd]) {
				maxInd = i;
			}
			if (numArray[i] < numArray[minInd]) {
				minInd = i;
			}
		}

		// Обмен местами наибольшего и наименьшего элемента
		
		double tempEl;
		tempEl = numArray[maxInd];
		numArray[maxInd] = numArray[minInd];
		numArray[minInd] = tempEl;

		System.out.println("Результат: " + Arrays.toString(numArray));
	}

	// Генерирует случайный массив вещественных чисел
	private static double[] generateArray(int length) {
		double[] randArray = new double[length];
		double element;

		for (int i = 0; i < randArray.length; i++) {
			element = Math.random() * 100;
			element = Math.round(element * 100) / 100d;

			randArray[i] = element;
		}

		return randArray;
	}

}
