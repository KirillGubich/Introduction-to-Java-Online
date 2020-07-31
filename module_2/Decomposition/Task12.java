package by.jonline.decomposition.main;

/*
  Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
  элементами которого являются числа, сумма цифр которых равна К и которые не больше N. 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		int k;
		int n;

		k = getIntFromConsole("K = ");
		n = getIntFromConsole("N = ");

		int[] newArray = getArray(k, n);

		System.out.println("Результат: " + Arrays.toString(newArray));
	}

	// Формирование массива, элементами которого являются числа,
	// сумма цифр которых равна digitSum и которые не больше maxValue
	private static int[] getArray(int digitSum, int maxValue) {
		int arraySize;
		arraySize = getArraySize(digitSum, maxValue);

		int[] resultArray = new int[arraySize];

		int i = 0;
		for (int j = 0; j <= maxValue; j++) {

			if (getDigitSum(j) == digitSum) {
				resultArray[i] = j;
				i++;
			}
		}

		return resultArray;
	}

	// Размер массива
	private static int getArraySize(int sum, int max) {
		int size = 0;

		for (int i = 0; i <= max; i++) {
			if (getDigitSum(i) == sum) {
				size++;
			}
		}

		return size;
	}

	// Сумма цифр числа
	private static int getDigitSum(int num) {
		int sum = 0;

		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}

		return sum;
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
