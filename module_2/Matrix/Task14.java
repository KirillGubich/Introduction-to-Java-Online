package by.jonline.matrix.main;

/*
   Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
   причем в каждом столбце число единиц равно номеру столбца.
*/

public class Task14 {

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

	}

	// Генерирует случайную матрицу m x n, состоящую из нулей и единиц,
	// причем в каждом столбце число единиц равно номеру столбца.
	private static int[][] generateMatrix(int m, int n) {
		int[][] matrix = new int[m][n];

		for (int j = 0; j < n; j++) {

			int onesCount = 0;
			double element;
			int line;

			do {
				element = Math.random() * (m - 1);
				line = (int) Math.round(element);
				if (matrix[line][j] != 1) {
					matrix[line][j] = 1;
					onesCount++;
				}

			} while (onesCount < j + 1);
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
