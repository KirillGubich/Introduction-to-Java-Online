package by.jonline.matrix.main;

// Отсотрировать столбцы матрицы по возрастанию и убыванию значений эементов

public class Task13 {

	public static void main(String[] args) {

		int line; // количество строк в матрице
		int col; // количетсво столбцов в матрице

		line = 4;
		col = 5;

		int[][] doubleArray = generateMatrix(line, col);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		// Сортировка столбцов матрицы по возрастанию

		System.out.println("По возрастанию: ");
		System.out.println();
		printMatrix(ascendingSort(doubleArray));
		System.out.println();

		// Сортировка столбцов матрицы по убыванию

		System.out.println("По убыванию: ");
		System.out.println();
		printMatrix(descendingSort(doubleArray));

	}

	// Генерирует матрицу со случаными значениями от 0 до 100
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

	// Сортирует столбцы матрицы по возрастанию
	private static int[][] ascendingSort(int[][] numArray) {

		for (int col = 0; col < numArray[0].length; col++) {

			for (int i = numArray.length - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (numArray[j][col] > numArray[j + 1][col]) {
						int tempEl = numArray[j][col];
						numArray[j][col] = numArray[j + 1][col];
						numArray[j + 1][col] = tempEl;
					}
				}
			}
		}

		return numArray;
	}

	// Сортирует столбцы матрицы по убыванию
	private static int[][] descendingSort(int[][] numArray) {

		for (int col = 0; col < numArray[0].length; col++) {

			for (int i = numArray.length - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (numArray[j][col] < numArray[j + 1][col]) {
						int tempEl = numArray[j][col];
						numArray[j][col] = numArray[j + 1][col];
						numArray[j + 1][col] = tempEl;
					}
				}
			}
		}

		return numArray;
	}

}
