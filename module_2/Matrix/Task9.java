package by.jonline.matrix.main;

/*
   Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
   Определить, какой столбец содержит максимальную сумму. 
*/

public class Task9 {

	public static void main(String[] args) {

		int line; // количество строк в матрице
		int col; // количетсво столбцов в матрице

		line = 5;
		col = 5;

		int[][] doubleArray = generateMatrix(line, col);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		int maxSum = 0; // Максимальная сумма
		int maxSumInd = 0; // Индекс столбца с максимальной суммой

		// Поиск суммы элементов в каждом столбце и максимальной суммы

		for (int j = 0; j < col; j++) {
			int sumInColumn = 0; // сумма элементов в столбце

			for (int i = 0; i < line; i++) {
				sumInColumn += doubleArray[i][j];
			}
			System.out.println("Cумма в столбце " + (j + 1) + " = " + sumInColumn);

			if (sumInColumn > maxSum) {
				maxSum = sumInColumn;
				maxSumInd = j;
			}
		}

		System.out.println("Максимальная сумма в столбце " + (maxSumInd + 1));

	}

	// Генерирует матрицу со случаными целочисленными неотрицательными значениями
	private static int[][] generateMatrix(int m, int n) {
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 101);
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
}
