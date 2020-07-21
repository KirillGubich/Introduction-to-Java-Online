package by.jonline.array.main;

//  Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 

import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {
		
		int n = 10;
		int[] numArray = generateArray(n);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > i) {
				System.out.println(numArray[i] + "  ");
			}
		}

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
