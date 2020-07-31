package by.jonline.decomposition.main;

// Дано натуральное число N. Написать метод(методы) для формирования массива, 
// элементами которого являются цифры числа N. 

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		int n;
		n = getIntFromConsole("N = ");

		int[] result = createArray(n);
		System.out.println(Arrays.toString(result));
	}

	// Формирует массив, элементами которого являются цифры числа num
	private static int[] createArray(int num) {
		int elementCount;
		elementCount = countDigits(num);

		int[] array = new int[elementCount];

		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = num % 10;
			num /= 10;
		}

		return array;
	}

	// Подсчет количества цифр в числе
	private static int countDigits(int num) {
		int digitCount = 0;

		while (num != 0) {
			num /= 10;
			digitCount++;
		}

		return digitCount;
	}

	// Ввод с консоли целого числа
	private static int getIntFromConsole(String message) {
		int num;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print(">> " + message);
		while (!in.hasNextInt()) {
			in.next();
			System.out.print("Некорректные данные. >> ");
		}
		num = in.nextInt();

		return num;
	}

}
