package by.jonline.string.main;

import java.util.Scanner;

//  Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {

	public static void main(String[] args) {

		String str;	
		str = getStr();

		int maxSp;

		maxSp = maxSpaces(str);

		System.out.println("Максиально пробелов подряд: " + maxSp);
	}

	// Подсчет наибольшего количества подряд идущих пробелов
	public static int maxSpaces(String str) {

		int spaceMax = 0;
		int spaceCount = 0;

		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == ' ') {
				spaceCount++;

			} else {

				if (spaceCount > spaceMax) {
					spaceMax = spaceCount;
				}
				spaceCount = 0;
			}
		}

		// Дополнительная проверка, если последний символ в строке пробел
		if (spaceCount > spaceMax) {
			spaceMax = spaceCount;
		}

		return spaceMax;
	}
	
	// Ввод строки с консоли
	public static String getStr() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String str;

		System.out.print(">> ");
		str = scanner.nextLine();
		
		return str;
	}

}
