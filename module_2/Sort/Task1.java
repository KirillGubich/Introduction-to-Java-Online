package by.jonline.sort.main;

/*
   Заданы два одномерных массива с различным количеством элементов и натуральное число k.
   Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, 
   при этом не используя дополнительный массив
*/

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		int firstArrayLength;
		int secondArrayLength;

		firstArrayLength = 14;
		secondArrayLength = 7;

		int[] firstArray = generateArray(firstArrayLength);
		int[] secondArray = generateArray(secondArrayLength);

		System.out.println("Первый массив " + Arrays.toString(firstArray));
		System.out.println("Второй массив " + Arrays.toString(secondArray));

		int k;
		k = 8;

		int[] resultArray = concatArrays(firstArray, secondArray, k);
		System.out.println("Результат: " + Arrays.toString(resultArray));

	}

	// Генерирует случайный массив целочисленных положительных значений
	private static int[] generateArray(int length) {
		int[] randArray = new int[length];

		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * 101);
		}

		return randArray;
	}

	// Объедниние двух массивов
	private static int[] concatArrays(int[] fArray, int[] sArray, int position) {

		int[] res = new int[fArray.length + sArray.length];

		for (int i = 0; i < position; i++) {
			res[i] = fArray[i];
		}

		int i = position;
		for (int j = 0; j < sArray.length; j++) {
			res[i] = sArray[j];
			i++;
		}

		for (int j = position; j < fArray.length; j++) {
			res[i] = fArray[j];
			i++;
		}

		return res;
	}

}
