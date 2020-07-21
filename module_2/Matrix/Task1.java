package by.jonline.matrix.main;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {

	public static void main(String[] args) {

		int line; // количество строк в матрице
		int col; // количетсво столбцов в матрице

		line = 5;
		col = 3;

		int[][] doubleArray = generateMatrix(line, col);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		// Поиск и вывод нечетных столбцов,
		// у которых первый элемент больше последнего
		for (int j = 0; j < col; j += 2) {
			if (doubleArray[0][j] > doubleArray[line - 1][j]) {
				for (int i = 0; i < line; i++) {
					System.out.println(doubleArray[i][j]);
				}
				System.out.println();
			}
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

}
