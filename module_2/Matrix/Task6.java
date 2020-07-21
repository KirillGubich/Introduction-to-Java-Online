package by.jonline.matrix.main;

import java.util.Scanner;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task6 {

	public static void main(String[] args) {

		// Ввод размера матрицы

		int size; // размер матрицы
		boolean incorrectInput;

		// Ввод данных пользователем
		do {
			size = getIntFromConsole("n = ");
			incorrectInput = size < 2 || size % 2 == 1;

			if (incorrectInput) {
				System.out.println("Размер матрицы должен быть положительным и четным");
			}
		} while (incorrectInput);

		int[][] doubleArray = new int[size][size];

		// Заполнение матрицы

		int param = 0;

		for (int i = 0; i < size; i++) {
			int j = 0 + param;
			while (j < size - param) {
				doubleArray[i][j] = 1;
				j++;
			}

			if (i < size / 2 - 1) {
				param++;
			} else if (i >= size / 2) {
				param--;
			}
		}

		System.out.println("Полученная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
	}

	// Вывод матрицы в консоль
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
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
