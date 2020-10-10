package by.jonline.string.main;

import java.util.Scanner;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {

	public static void main(String[] args) {
	
		String str;	
		str = getStr();
		
		System.out.println("Result: " + doubleChar(str));
		
	}
	
	// Пвторяет каждый символ в строке дважды
	public static String doubleChar(String srcStr) {
		StringBuilder resStr = new StringBuilder(srcStr);
		
		for (int i = 0; i < srcStr.length(); i++) {
			 resStr.insert(i * 2, srcStr.charAt(i));
		}
	
		return resStr.toString();
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
