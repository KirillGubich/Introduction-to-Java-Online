package by.jonline.matrix.main;

import java.util.Scanner;

/*
   Магическим квадратом порядка n называется квадратная матрица размера nxn, 
   составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, 
   каждой строке и каждой из двух больших диагоналей равны между собой. 
   Построить такой квадрат
*/

public class Task16 {

	public static void main(String[] args) {

		// Ввод размера матрицы

		int size; // размер матрицы
		boolean incorrectInput;

		// Ввод данных пользователем
		do {
			size = getIntFromConsole("n = ");
			incorrectInput = size < 2;

			if (incorrectInput) {
				System.out.println("Размер матрицы должен быть больше 2");
			}
		} while (incorrectInput);

		int[][] magicSquare = getMagicSquare(size);

		// Вывод результата

		System.out.println();
		System.out.println("Магический квадрат: ");
		System.out.println();
		printMatrix(magicSquare);
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

	// Построение магического квадрата n x n
	private static int[][] getMagicSquare(int n) {

		int[] numArray = new int[n * n];
		int[][] square = new int[n][n];

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
		}

		while (!isSquareMagic(square)) {
			swapRandElements(numArray);
			convertToSquare(numArray, square);
		}

		return square;
	}

	// Проверяет, является ли квадрат магическим
	private static boolean isSquareMagic(int[][] square) {

		int n; // Размер квадрата
		n = square.length;

		// Сумма элементов в строках, столбцах и диагоналях
		final int MAGIC_SUM = (n * (n * n + 1)) / 2;

		// Проверка суммы в строках

		for (int i = 0; i < n; i++) {
			if (arraySum(square[i]) != MAGIC_SUM) {
				return false;
			}
		}

		// Проверка суммы в столбцах

		for (int j = 0; j < n; j++) {
			int colSum = 0;

			for (int i = 0; i < n; i++) {
				colSum += square[i][j];
			}

			if (colSum != MAGIC_SUM) {
				return false;
			}
		}

		// Проверка суммы на диагоналях

		int mainDiagonalSum = 0;

		for (int i = 0; i < n; i++) {
			mainDiagonalSum += square[i][i];
		}

		if (mainDiagonalSum != MAGIC_SUM) {
			return false;
		}

		int sideDiagonalSum = 0;

		for (int i = 0; i < n; i++) {
			sideDiagonalSum += square[i][n - 1 - i];
		}

		if (sideDiagonalSum != MAGIC_SUM) {
			return false;
		}

		return true;
	}

	// Меняет местами 2 случайных элемента массива
	private static void swapRandElements(int[] array) {
		int firstInd;
		int secondInd;

		firstInd = (int) (Math.random() * array.length);
		secondInd = (int) (Math.random() * array.length);

		int tempEl = array[firstInd];
		array[firstInd] = array[secondInd];
		array[secondInd] = tempEl;
	}

	// Преобразует одномерный массив в двумерный
	private static void convertToSquare(int[] array, int[][] matrix) {
		int indCount = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = array[indCount];
				indCount++;
			}
		}
	}

	private static int arraySum(int[] array) {
		int sum = 0;

		for (int element : array) {
			sum += element;
		}

		return sum;
	}

}
