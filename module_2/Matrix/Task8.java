package by.jonline.matrix.main;

import java.util.Scanner;

/*
   В числовой матрице поменять местами два столбца любых столбца, 
   т. е. все элементы одного столбца поставить на соответствующие 
   им позиции другого, а его элементы второго переместить в первый. 
   Номера столбцов вводит пользователь с клавиатуры. 
*/

public class Task8 {

	public static void main(String[] args) {

		int line; // количество строк в матрице
		int col; // количетсво столбцов в матрице

		line = 4;
		col = 4;

		int[][] doubleArray = generateMatrix(line, col);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		int firstCol;
		int secondCol;
		boolean incorrectInput;

		// Ввод данных пользователем
		do {
			firstCol = getIntFromConsole("номер 1 столбца = ");
			secondCol = getIntFromConsole("номер 2 столбца = ");

			incorrectInput = firstCol <= 0 || firstCol > col || secondCol <= 0 || secondCol > col;
			if (incorrectInput) {
				System.out.println("Не выходите за границы матрицы.");
			}
		} while (incorrectInput);
		
		// Обмен местами двух столбцов
		for (int i = 0; i < line; i++) {
			int tempEl = doubleArray[i][firstCol-1];
			doubleArray[i][firstCol-1] = doubleArray[i][secondCol-1];
			doubleArray[i][secondCol-1] = tempEl;
		}

		System.out.println("Результат: ");
		System.out.println();
		printMatrix(doubleArray);
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
