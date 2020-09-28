package by.jonline.char_array.main;

import java.util.Scanner;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов 
// заменить на одиночные пробелы. Крайние пробелы в строке удалить.

public class Task5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str;

		System.out.print(">> ");
		str = scanner.nextLine();
		
		str = cutSpaces(str);

		System.out.println("Result: |" + str + "|");

	}

	// Удаление лишних пробелов в строке
	public static String cutSpaces(String str) {

		char[] charArray;
		charArray = str.toCharArray();

		int counter = 0;

		int j = 0;

		// Удаление лишних пробелов
		while (j < charArray.length - 1) {
			if (charArray[j] == ' ' && charArray[j + 1] == ' ') {
				shiftLeft(charArray, j + 1);
				counter++;
			} else {
				j++;
			}
		}
		
		// Удаление пробела в начале строки
		if (charArray[0] == ' ') {
			shiftLeft(charArray, 0);
			counter++;
		}

		// Удаление пробела в конце строки
		if (charArray[charArray.length - 1 - counter] == ' ') {
			shiftLeft(charArray, charArray.length - 1 - counter);
			counter++;
		}

		// Созадние нового массива
		char[] resArray = new char[charArray.length - counter];

		// Копирование оставшихся элементов
		for (int i = 0; i < resArray.length; i++) {
			resArray[i] = charArray[i];
		}

		return new String(resArray);
	}

	// Сдвиг строки влево
	public static void shiftLeft(char[] arr, int index) {
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[arr.length - 1] = '-';
	}
	
}
