package by.jonline.matrix.main;

import java.util.Scanner;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class Task3 {

	public static void main(String[] args) {

		int line; // количество строк в матрице
		int col; // количетсво столбцов в матрице

		line = 5;
		col = 7;

		int[][] doubleArray = generateMatrix(line, col);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		int k;
		int p;
		boolean incorrectInput;

		// Ввод данных пользователем
		do {
			k = getIntFromConsole("k = ");
			p = getIntFromConsole("p = ");

			incorrectInput = k <= 0 || k > line || p <= 0 || p > col;
			if (incorrectInput) {
				System.out.println("Не выходите за границы матрицы.");
			}
		} while (incorrectInput);

		
		// Вывод к-ой строки
		System.out.print(k + " строка: ");
		for (int j = 0; j < col; j++) {
			System.out.print(doubleArray[k - 1][j] + "  ");
		}

		System.out.println();

		// Вывод p-ого столбца
		System.out.print(p + " столбец: ");
		for (int i = 0; i < line; i++) {
			System.out.print(doubleArray[i][p - 1] + "  ");
		}
	}

	// Генерирует матрицу со случаными целочисленными значениями
	private static int[][] generateMatrix(int m, int n) {
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 201 - 100);
			}
		}

		return matrix;
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
