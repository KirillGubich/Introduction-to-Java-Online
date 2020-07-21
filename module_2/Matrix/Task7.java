package by.jonline.matrix.main;

import java.util.Scanner;

// Сформировать квадратную матрицу порядка N по правилу
// и подсчитать количество положительных элементов в ней. 

public class Task7 {

	public static void main(String[] args) {

		// Ввод размера матрицы

		int size; // размер матрицы
		boolean incorrectInput;
		
		// Ввод данных пользователем
		do {
			size = getIntFromConsole("n = ");
			incorrectInput = size < 1;

			if (incorrectInput) {
				System.out.println("Размер матрицы должен быть положительным");
			}
		} while (incorrectInput);

		double[][] doubleArray = new double[size][size];

		// Заполнение матрицы и подсчет положительных элементов
		
		int posElements = 0;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				doubleArray[i][j] = Math.sin((i*i - j*j) / size);
				if (doubleArray[i][j] > 0) {
					posElements++;
				}
			}
		}
		
		System.out.println("Полученная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();
		System.out.println("Положительных элементов: " + posElements);
	}

	// Вывод матрицы в консоль
	private static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(Math.round(matrix[i][j] * 100) / 100d + "\t");
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
