package by.jonline.char_array.main;

import java.util.Scanner;

//  В строке найти количество цифр. 

public class Task3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str;

		System.out.print(">> ");
		str = scanner.nextLine();

		char[] charArray;
		charArray = str.toCharArray();

		int digitCount = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (isDigit(charArray[i])) {
				digitCount++;
			}
		}

		System.out.println("Количество цифр: " + digitCount);
	}

	// Является ли символ цифрой
	public static boolean isDigit(char symbol) {

		return symbol >= '0' && symbol <= '9';
	}

}
