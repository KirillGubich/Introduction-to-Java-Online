package by.jonline.matrix.main;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {

	public static void main(String[] args) {

		int line; // количество строк в матрице
		int col; // количетсво столбцов в матрице

		line = 3;
		col = 4;

		int[][] doubleArray = generateMatrix(line, col);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		int maxElement = getMaxElement(doubleArray);

		// Замена всех нечетных элементов на максимальный

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				if (doubleArray[i][j] % 2 == 1) {
					doubleArray[i][j] = maxElement;
				}
			}
		}

		System.out.println("Результат: ");
		System.out.println();
		printMatrix(doubleArray);
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

	// Находит максимальный элемент в матрице
	private static int getMaxElement(int[][] matrix) {
		int maxEl;
		maxEl = matrix[0][0];

		for (int[] line : matrix) {
			for (int element : line) {
				if (element > maxEl) {
					maxEl = element;
				}
			}
		}

		return maxEl;
	}

}
