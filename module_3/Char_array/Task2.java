package by.jonline.char_array.main;

import java.util.Scanner;

// Замените в строке все вхождения 'word' на 'letter'. 

public class Task2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str;
		
		System.out.print(">> ");
		str = scanner.nextLine();

		char[] charArray;
		charArray = str.toCharArray();
		
		char[] letter = { 'l', 'e', 't', 't', 'e', 'r' };

		for (int i = 0; i < charArray.length; i++) {
			
			if (isWord(charArray, i)) {
				charArray = shiftRight(charArray, i, 2);
				
				for (int j = 0; j < letter.length; j++) {
					charArray[i + j] = letter[j];
				}
			}
		}

		str = new String(charArray);

		System.out.println(str);

	}

	// Находится ли в позиции index слово word
	public static boolean isWord(char[] charArray, int index) {
		char[] word = { 'w', 'o', 'r', 'd' };

		for (int i = 0; i < word.length; i++) {
			if (index + i >= charArray.length || charArray[index + i] != word[i]) {
				return false;
			}
		}

		return true;
	}

	// Сдвиг массива символов вправо,
	// начиная с определенного элемента
	private static char[] shiftRight(char[] array, int index, int count) {

		char[] newArray = new char[array.length + count];

		int i = 0;
		int j = 0;

		while (i < newArray.length) {
			if (i <= index || i > index + count) {
				newArray[i] = array[j];
				j++;
			}

			i++;
		}

		return newArray;

	}
}
