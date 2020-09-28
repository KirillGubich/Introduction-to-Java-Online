package by.jonline.char_array.main;

import java.util.Scanner;

//  В строке найти количество чисел. 

public class Task4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str;

		System.out.print(">> ");
		str = scanner.nextLine();

		int nums;
		nums = numberCount(str);

		System.out.println("Количество чисел: " + nums);

	}

	// Подсчет количества чисел в строке
	public static int numberCount(String str) {
		int numCount = 0;

		char[] charArray;
		charArray = str.toCharArray();

		for (int i = 0; i < charArray.length - 1; i++) {

			if (isDigit(charArray[i]) && !isDigit(charArray[i + 1])) {
				numCount++;
			}
		}

		// Проверка последенго элемента
		if (isDigit(charArray[charArray.length - 1])) {
			numCount++;
		}

		return numCount;
	}

	// Является ли символ цифрой
	public static boolean isDigit(char symbol) {

		return symbol >= '0' && symbol <= '9';
	}
}
