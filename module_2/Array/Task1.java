package by.jonline.array.main;
 
//  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		// Ввод исходных данных
		
		System.out.print(">> N = ");
		int n = getIntValue();
		
		System.out.print(">> K = ");
		int k = getIntValue();

		int[] numArray = generateArray(n);
		System.out.println("Исходный массив: " + Arrays.toString(numArray));
		
		// Поиск суммы элементов, кратных К
		int sum = 0;
		for (int num : numArray) {
			if (num % k == 0) {
				sum += num;
			}
		}

		System.out.println("Сумма чисел кратных " + k + " равна: " + sum);
	}

	// Генерирует случайный массив целочисленных положительных значений
	private static int[] generateArray(int length) {
		int[] randArray = new int[length];

		for (int i = 0; i < randArray.length; i++) {	
			randArray[i] = (int) (Math.random() * 101);
		}

		return randArray;
	}

	// Позволяет получить корректный ввод целочисленного значения
	private static int getIntValue() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int value;
		
		while (!in.hasNextInt()) {
			in.next();
			System.out.println("Некорректные данные. Попробуйте еще раз. ");
			System.out.print(">> ");
		}

		value = in.nextInt();
		return value;
	}
}
