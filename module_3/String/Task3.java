package by.jonline.string.main;

import java.util.Scanner;

// Проверить, является ли заданное слово палиндромом.

public class Task3 {

	public static void main(String[] args) {
		
		String str;	
		str = getStr();

		if (isPalindrom(str)) {
			System.out.println("It is a palindrom");
		} else {
			System.out.println("It is NOT a palindrom");
		}
		
	}

	// Является ли строка палиндромом
	public static boolean isPalindrom(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		
		if (sb.toString().equals(sb.reverse().toString())) {
			return true;
		} else {
			return false;
		}
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
