package by.jonline.string.main;

import java.util.Scanner;

//  В строке вставить после каждого символа 'a' символ 'b'. 

public class Task2 {

	public static void main(String[] args) {

		String str;	
		str = getStr();

		StringBuilder sb = new StringBuilder(str);

		// Вставка после каждого символа 'a' символ 'b'
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'a') {
				sb.insert(i + 1, 'b');
			}
		}

		str = sb.toString();

		System.out.println("Result: " + str);
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
