package by.jonline.string.main;

import java.util.Scanner;

//  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {

	public static void main(String[] args) {

		String str;	
		str = getStr();
		
		int charCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				charCount++;
			}
		}
		
		System.out.println("Result: " + charCount);
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
