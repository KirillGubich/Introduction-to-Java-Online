package by.jonline.array.main;

/*
   Дан целочисленный массив с количеством элементов n. 
   Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
   Примечание. Дополнительный массив не использовать. 
*/

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		int n = 7;

		int[] numArray = generateArray(n);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));

		int i = 1;
		int j = 2;

		while (j < n) {
			numArray[i] = numArray[j];
			i++;
			j += 2;
		}

		int k = n % 2 == 0 ? n / 2 : n / 2 + 1;
		while (k < n) {
			numArray[k] = 0;
			k++;
		}

		System.out.println("Результат: " + Arrays.toString(numArray));
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
